// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20200910.models;

import com.aliyun.tea.*;

public class DetectIPCPedestrianOptimizedRequest extends TeaModel {
    // image data
    @NameInMap("imageData")
    public byte[] imageData;

    // image width
    @NameInMap("width")
    public Long width;

    // image height
    @NameInMap("height")
    public Long height;

    public static DetectIPCPedestrianOptimizedRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectIPCPedestrianOptimizedRequest self = new DetectIPCPedestrianOptimizedRequest();
        return TeaModel.build(map, self);
    }

    public DetectIPCPedestrianOptimizedRequest setImageData(byte[] imageData) {
        this.imageData = imageData;
        return this;
    }
    public byte[] getImageData() {
        return this.imageData;
    }

    public DetectIPCPedestrianOptimizedRequest setWidth(Long width) {
        this.width = width;
        return this;
    }
    public Long getWidth() {
        return this.width;
    }

    public DetectIPCPedestrianOptimizedRequest setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

}
