// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SummaryImagesRequest extends TeaModel {
    /**
     * <p>The names of all images in the cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ContainerType")
    public String containerType;

    public static SummaryImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        SummaryImagesRequest self = new SummaryImagesRequest();
        return TeaModel.build(map, self);
    }

    public SummaryImagesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SummaryImagesRequest setContainerType(String containerType) {
        this.containerType = containerType;
        return this;
    }
    public String getContainerType() {
        return this.containerType;
    }

}
