// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DetectImageQRCodesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ImageUri")
    public String imageUri;

    @NameInMap("QRCodes")
    public java.util.List<DetectImageQRCodesResponseBodyQRCodes> QRCodes;

    public static DetectImageQRCodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectImageQRCodesResponseBody self = new DetectImageQRCodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectImageQRCodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectImageQRCodesResponseBody setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

    public DetectImageQRCodesResponseBody setQRCodes(java.util.List<DetectImageQRCodesResponseBodyQRCodes> QRCodes) {
        this.QRCodes = QRCodes;
        return this;
    }
    public java.util.List<DetectImageQRCodesResponseBodyQRCodes> getQRCodes() {
        return this.QRCodes;
    }

    public static class DetectImageQRCodesResponseBodyQRCodesQRCodeBoundary extends TeaModel {
        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        public static DetectImageQRCodesResponseBodyQRCodesQRCodeBoundary build(java.util.Map<String, ?> map) throws Exception {
            DetectImageQRCodesResponseBodyQRCodesQRCodeBoundary self = new DetectImageQRCodesResponseBodyQRCodesQRCodeBoundary();
            return TeaModel.build(map, self);
        }

        public DetectImageQRCodesResponseBodyQRCodesQRCodeBoundary setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public DetectImageQRCodesResponseBodyQRCodesQRCodeBoundary setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public DetectImageQRCodesResponseBodyQRCodesQRCodeBoundary setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DetectImageQRCodesResponseBodyQRCodesQRCodeBoundary setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

    }

    public static class DetectImageQRCodesResponseBodyQRCodes extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("QRCodeBoundary")
        public DetectImageQRCodesResponseBodyQRCodesQRCodeBoundary QRCodeBoundary;

        public static DetectImageQRCodesResponseBodyQRCodes build(java.util.Map<String, ?> map) throws Exception {
            DetectImageQRCodesResponseBodyQRCodes self = new DetectImageQRCodesResponseBodyQRCodes();
            return TeaModel.build(map, self);
        }

        public DetectImageQRCodesResponseBodyQRCodes setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DetectImageQRCodesResponseBodyQRCodes setQRCodeBoundary(DetectImageQRCodesResponseBodyQRCodesQRCodeBoundary QRCodeBoundary) {
            this.QRCodeBoundary = QRCodeBoundary;
            return this;
        }
        public DetectImageQRCodesResponseBodyQRCodesQRCodeBoundary getQRCodeBoundary() {
            return this.QRCodeBoundary;
        }

    }

}
