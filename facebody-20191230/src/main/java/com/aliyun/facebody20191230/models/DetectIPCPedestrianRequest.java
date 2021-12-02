// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectIPCPedestrianRequest extends TeaModel {
    @NameInMap("Height")
    public Integer height;

    @NameInMap("ImageData")
    public String imageData;

    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("Width")
    public Integer width;

    public static DetectIPCPedestrianRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectIPCPedestrianRequest self = new DetectIPCPedestrianRequest();
        return TeaModel.build(map, self);
    }

    public DetectIPCPedestrianRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public DetectIPCPedestrianRequest setImageData(String imageData) {
        this.imageData = imageData;
        return this;
    }
    public String getImageData() {
        return this.imageData;
    }

    public DetectIPCPedestrianRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public DetectIPCPedestrianRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

}
