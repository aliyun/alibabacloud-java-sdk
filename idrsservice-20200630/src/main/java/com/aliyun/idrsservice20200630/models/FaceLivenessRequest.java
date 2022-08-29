// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class FaceLivenessRequest extends TeaModel {
    @NameInMap("FaceRequest")
    public FaceLivenessRequestFaceRequest faceRequest;

    public static FaceLivenessRequest build(java.util.Map<String, ?> map) throws Exception {
        FaceLivenessRequest self = new FaceLivenessRequest();
        return TeaModel.build(map, self);
    }

    public FaceLivenessRequest setFaceRequest(FaceLivenessRequestFaceRequest faceRequest) {
        this.faceRequest = faceRequest;
        return this;
    }
    public FaceLivenessRequestFaceRequest getFaceRequest() {
        return this.faceRequest;
    }

    public static class FaceLivenessRequestFaceRequest extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("SourceImage")
        public String sourceImage;

        public static FaceLivenessRequestFaceRequest build(java.util.Map<String, ?> map) throws Exception {
            FaceLivenessRequestFaceRequest self = new FaceLivenessRequestFaceRequest();
            return TeaModel.build(map, self);
        }

        public FaceLivenessRequestFaceRequest setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public FaceLivenessRequestFaceRequest setSourceImage(String sourceImage) {
            this.sourceImage = sourceImage;
            return this;
        }
        public String getSourceImage() {
            return this.sourceImage;
        }

    }

}
