// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectIPCPedestrianRequest extends TeaModel {
    @NameInMap("ImageData")
    public String imageData;

    @NameInMap("Width")
    public Integer width;

    @NameInMap("Height")
    public Integer height;

    public static DetectIPCPedestrianRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectIPCPedestrianRequest self = new DetectIPCPedestrianRequest();
        return TeaModel.build(map, self);
    }

    public DetectIPCPedestrianRequest setImageData(String imageData) {
        this.imageData = imageData;
        return this;
    }
    public String getImageData() {
        return this.imageData;
    }

    public DetectIPCPedestrianRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

    public DetectIPCPedestrianRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

}
