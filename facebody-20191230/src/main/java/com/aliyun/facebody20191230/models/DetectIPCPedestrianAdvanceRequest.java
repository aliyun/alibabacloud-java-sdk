// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectIPCPedestrianAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("Height")
    public Integer height;

    @NameInMap("ImageData")
    public String imageData;

    @NameInMap("Width")
    public Integer width;

    public static DetectIPCPedestrianAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectIPCPedestrianAdvanceRequest self = new DetectIPCPedestrianAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectIPCPedestrianAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public DetectIPCPedestrianAdvanceRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public DetectIPCPedestrianAdvanceRequest setImageData(String imageData) {
        this.imageData = imageData;
        return this;
    }
    public String getImageData() {
        return this.imageData;
    }

    public DetectIPCPedestrianAdvanceRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

}
