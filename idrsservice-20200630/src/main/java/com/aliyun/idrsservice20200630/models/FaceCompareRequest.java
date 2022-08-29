// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class FaceCompareRequest extends TeaModel {
    @NameInMap("FaceRequest")
    public FaceCompareRequestFaceRequest faceRequest;

    public static FaceCompareRequest build(java.util.Map<String, ?> map) throws Exception {
        FaceCompareRequest self = new FaceCompareRequest();
        return TeaModel.build(map, self);
    }

    public FaceCompareRequest setFaceRequest(FaceCompareRequestFaceRequest faceRequest) {
        this.faceRequest = faceRequest;
        return this;
    }
    public FaceCompareRequestFaceRequest getFaceRequest() {
        return this.faceRequest;
    }

    public static class FaceCompareRequestFaceRequest extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("SourceImage")
        public String sourceImage;

        @NameInMap("TargetImage")
        public String targetImage;

        public static FaceCompareRequestFaceRequest build(java.util.Map<String, ?> map) throws Exception {
            FaceCompareRequestFaceRequest self = new FaceCompareRequestFaceRequest();
            return TeaModel.build(map, self);
        }

        public FaceCompareRequestFaceRequest setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public FaceCompareRequestFaceRequest setSourceImage(String sourceImage) {
            this.sourceImage = sourceImage;
            return this;
        }
        public String getSourceImage() {
            return this.sourceImage;
        }

        public FaceCompareRequestFaceRequest setTargetImage(String targetImage) {
            this.targetImage = targetImage;
            return this;
        }
        public String getTargetImage() {
            return this.targetImage;
        }

    }

}
