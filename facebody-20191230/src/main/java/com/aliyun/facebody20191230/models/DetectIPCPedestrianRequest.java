// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectIPCPedestrianRequest extends TeaModel {
    @NameInMap("ContinueOnError")
    public Boolean continueOnError;

    @NameInMap("ImageData")
    public String imageData;

    @NameInMap("Width")
    public Integer width;

    @NameInMap("Height")
    public Integer height;

    @NameInMap("URLList")
    public java.util.List<DetectIPCPedestrianRequestURLList> URLList;

    public static DetectIPCPedestrianRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectIPCPedestrianRequest self = new DetectIPCPedestrianRequest();
        return TeaModel.build(map, self);
    }

    public DetectIPCPedestrianRequest setContinueOnError(Boolean continueOnError) {
        this.continueOnError = continueOnError;
        return this;
    }
    public Boolean getContinueOnError() {
        return this.continueOnError;
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

    public DetectIPCPedestrianRequest setURLList(java.util.List<DetectIPCPedestrianRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<DetectIPCPedestrianRequestURLList> getURLList() {
        return this.URLList;
    }

    public static class DetectIPCPedestrianRequestURLList extends TeaModel {
        public static DetectIPCPedestrianRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            DetectIPCPedestrianRequestURLList self = new DetectIPCPedestrianRequestURLList();
            return TeaModel.build(map, self);
        }

    }

}
