// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SummaryImagesInfoRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The type of the image. Set the value to singularity.</p>
     */
    @NameInMap("ContainerType")
    public String containerType;

    /**
     * <p>The name of the image. You can call the [SummaryImages](~~440783~~) operation to query the names of all images in a cluster.</p>
     */
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
