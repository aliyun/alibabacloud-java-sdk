// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class InspectImageRequest extends TeaModel {
    /**
     * <p>The ID of the E-HPC cluster where the image whose Inspect information you want to view resides.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The container type of the image. Set the value to singularity.</p>
     */
    @NameInMap("ContainerType")
    public String containerType;

    /**
     * <p>The name of the image whose Inspect information you want to view.</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    public static InspectImageRequest build(java.util.Map<String, ?> map) throws Exception {
        InspectImageRequest self = new InspectImageRequest();
        return TeaModel.build(map, self);
    }

    public InspectImageRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public InspectImageRequest setContainerType(String containerType) {
        this.containerType = containerType;
        return this;
    }
    public String getContainerType() {
        return this.containerType;
    }

    public InspectImageRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

}
