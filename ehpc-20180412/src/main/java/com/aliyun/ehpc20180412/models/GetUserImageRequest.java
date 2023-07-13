// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetUserImageRequest extends TeaModel {
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
     * <p>The image name.</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The path where the image is stored in the OSS bucket.</p>
     */
    @NameInMap("ImagePath")
    public String imagePath;

    /**
     * <p>The OSS bucket.</p>
     */
    @NameInMap("OSSBucket")
    public String OSSBucket;

    /**
     * <p>The OSS endpoint.</p>
     */
    @NameInMap("OSSEndPoint")
    public String OSSEndPoint;

    public static GetUserImageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserImageRequest self = new GetUserImageRequest();
        return TeaModel.build(map, self);
    }

    public GetUserImageRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetUserImageRequest setContainerType(String containerType) {
        this.containerType = containerType;
        return this;
    }
    public String getContainerType() {
        return this.containerType;
    }

    public GetUserImageRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public GetUserImageRequest setImagePath(String imagePath) {
        this.imagePath = imagePath;
        return this;
    }
    public String getImagePath() {
        return this.imagePath;
    }

    public GetUserImageRequest setOSSBucket(String OSSBucket) {
        this.OSSBucket = OSSBucket;
        return this;
    }
    public String getOSSBucket() {
        return this.OSSBucket;
    }

    public GetUserImageRequest setOSSEndPoint(String OSSEndPoint) {
        this.OSSEndPoint = OSSEndPoint;
        return this;
    }
    public String getOSSEndPoint() {
        return this.OSSEndPoint;
    }

}
