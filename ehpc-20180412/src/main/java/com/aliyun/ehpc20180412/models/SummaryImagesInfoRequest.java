// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SummaryImagesInfoRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The detailed information about the image.</p>
     */
    @NameInMap("ContainerType")
    public String containerType;

    @NameInMap("ImageName")
    public String imageName;

    public static SummaryImagesInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SummaryImagesInfoRequest self = new SummaryImagesInfoRequest();
        return TeaModel.build(map, self);
    }

    public SummaryImagesInfoRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SummaryImagesInfoRequest setContainerType(String containerType) {
        this.containerType = containerType;
        return this;
    }
    public String getContainerType() {
        return this.containerType;
    }

    public SummaryImagesInfoRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

}
