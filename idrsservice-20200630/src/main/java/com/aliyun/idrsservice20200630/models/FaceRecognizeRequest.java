// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class FaceRecognizeRequest extends TeaModel {
    @NameInMap("FaceRequest")
    public FaceRecognizeRequestFaceRequest faceRequest;

    public static FaceRecognizeRequest build(java.util.Map<String, ?> map) throws Exception {
        FaceRecognizeRequest self = new FaceRecognizeRequest();
        return TeaModel.build(map, self);
    }

    public FaceRecognizeRequest setFaceRequest(FaceRecognizeRequestFaceRequest faceRequest) {
        this.faceRequest = faceRequest;
        return this;
    }
    public FaceRecognizeRequestFaceRequest getFaceRequest() {
        return this.faceRequest;
    }

    public static class FaceRecognizeRequestFaceRequest extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Liveness")
        public Boolean liveness;

        @NameInMap("SourceImage")
        public String sourceImage;

        @NameInMap("TargetImage")
        public String targetImage;

        public static FaceRecognizeRequestFaceRequest build(java.util.Map<String, ?> map) throws Exception {
            FaceRecognizeRequestFaceRequest self = new FaceRecognizeRequestFaceRequest();
            return TeaModel.build(map, self);
        }

        public FaceRecognizeRequestFaceRequest setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public FaceRecognizeRequestFaceRequest setLiveness(Boolean liveness) {
            this.liveness = liveness;
            return this;
        }
        public Boolean getLiveness() {
            return this.liveness;
        }

        public FaceRecognizeRequestFaceRequest setSourceImage(String sourceImage) {
            this.sourceImage = sourceImage;
            return this;
        }
        public String getSourceImage() {
            return this.sourceImage;
        }

        public FaceRecognizeRequestFaceRequest setTargetImage(String targetImage) {
            this.targetImage = targetImage;
            return this;
        }
        public String getTargetImage() {
            return this.targetImage;
        }

    }

}
