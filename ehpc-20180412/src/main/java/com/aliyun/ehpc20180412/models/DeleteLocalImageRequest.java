// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteLocalImageRequest extends TeaModel {
    /**
     * <p>The ID of the cluster from which you want to delete the image.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The image type. Set the value to singularity.</p>
     */
    @NameInMap("ContainerType")
    public String containerType;

    /**
     * <p>The name of the image that you want to delete.</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    public static DeleteLocalImageRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLocalImageRequest self = new DeleteLocalImageRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLocalImageRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteLocalImageRequest setContainerType(String containerType) {
        this.containerType = containerType;
        return this;
    }
    public String getContainerType() {
        return this.containerType;
    }

    public DeleteLocalImageRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

}
