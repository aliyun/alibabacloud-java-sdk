// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class RegisterFaceImageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FaceImages")
    public java.util.List<RegisterFaceImageResponseBodyFaceImages> faceImages;

    public static RegisterFaceImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterFaceImageResponseBody self = new RegisterFaceImageResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterFaceImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RegisterFaceImageResponseBody setFaceImages(java.util.List<RegisterFaceImageResponseBodyFaceImages> faceImages) {
        this.faceImages = faceImages;
        return this;
    }
    public java.util.List<RegisterFaceImageResponseBodyFaceImages> getFaceImages() {
        return this.faceImages;
    }

    public static class RegisterFaceImageResponseBodyFaceImages extends TeaModel {
        @NameInMap("FaceImageId")
        public Long faceImageId;

        public static RegisterFaceImageResponseBodyFaceImages build(java.util.Map<String, ?> map) throws Exception {
            RegisterFaceImageResponseBodyFaceImages self = new RegisterFaceImageResponseBodyFaceImages();
            return TeaModel.build(map, self);
        }

        public RegisterFaceImageResponseBodyFaceImages setFaceImageId(Long faceImageId) {
            this.faceImageId = faceImageId;
            return this;
        }
        public Long getFaceImageId() {
            return this.faceImageId;
        }

    }

}
