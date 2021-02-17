// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DetectQRCodesResponseBody extends TeaModel {
    @NameInMap("SuccessDetails")
    public java.util.List<DetectQRCodesResponseBodySuccessDetails> successDetails;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FailDetails")
    public java.util.List<DetectQRCodesResponseBodyFailDetails> failDetails;

    public static DetectQRCodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectQRCodesResponseBody self = new DetectQRCodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectQRCodesResponseBody setSuccessDetails(java.util.List<DetectQRCodesResponseBodySuccessDetails> successDetails) {
        this.successDetails = successDetails;
        return this;
    }
    public java.util.List<DetectQRCodesResponseBodySuccessDetails> getSuccessDetails() {
        return this.successDetails;
    }

    public DetectQRCodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectQRCodesResponseBody setFailDetails(java.util.List<DetectQRCodesResponseBodyFailDetails> failDetails) {
        this.failDetails = failDetails;
        return this;
    }
    public java.util.List<DetectQRCodesResponseBodyFailDetails> getFailDetails() {
        return this.failDetails;
    }

    public static class DetectQRCodesResponseBodySuccessDetailsQRCodesQRCodesRectangle extends TeaModel {
        @NameInMap("Top")
        public String top;

        @NameInMap("Width")
        public String width;

        @NameInMap("Height")
        public String height;

        @NameInMap("Left")
        public String left;

        public static DetectQRCodesResponseBodySuccessDetailsQRCodesQRCodesRectangle build(java.util.Map<String, ?> map) throws Exception {
            DetectQRCodesResponseBodySuccessDetailsQRCodesQRCodesRectangle self = new DetectQRCodesResponseBodySuccessDetailsQRCodesQRCodesRectangle();
            return TeaModel.build(map, self);
        }

        public DetectQRCodesResponseBodySuccessDetailsQRCodesQRCodesRectangle setTop(String top) {
            this.top = top;
            return this;
        }
        public String getTop() {
            return this.top;
        }

        public DetectQRCodesResponseBodySuccessDetailsQRCodesQRCodesRectangle setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public DetectQRCodesResponseBodySuccessDetailsQRCodesQRCodesRectangle setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public DetectQRCodesResponseBodySuccessDetailsQRCodesQRCodesRectangle setLeft(String left) {
            this.left = left;
            return this;
        }
        public String getLeft() {
            return this.left;
        }

    }

    public static class DetectQRCodesResponseBodySuccessDetailsQRCodes extends TeaModel {
        @NameInMap("QRCodesRectangle")
        public DetectQRCodesResponseBodySuccessDetailsQRCodesQRCodesRectangle QRCodesRectangle;

        @NameInMap("Content")
        public String content;

        public static DetectQRCodesResponseBodySuccessDetailsQRCodes build(java.util.Map<String, ?> map) throws Exception {
            DetectQRCodesResponseBodySuccessDetailsQRCodes self = new DetectQRCodesResponseBodySuccessDetailsQRCodes();
            return TeaModel.build(map, self);
        }

        public DetectQRCodesResponseBodySuccessDetailsQRCodes setQRCodesRectangle(DetectQRCodesResponseBodySuccessDetailsQRCodesQRCodesRectangle QRCodesRectangle) {
            this.QRCodesRectangle = QRCodesRectangle;
            return this;
        }
        public DetectQRCodesResponseBodySuccessDetailsQRCodesQRCodesRectangle getQRCodesRectangle() {
            return this.QRCodesRectangle;
        }

        public DetectQRCodesResponseBodySuccessDetailsQRCodes setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class DetectQRCodesResponseBodySuccessDetails extends TeaModel {
        @NameInMap("SrcUri")
        public String srcUri;

        @NameInMap("QRCodes")
        public java.util.List<DetectQRCodesResponseBodySuccessDetailsQRCodes> QRCodes;

        public static DetectQRCodesResponseBodySuccessDetails build(java.util.Map<String, ?> map) throws Exception {
            DetectQRCodesResponseBodySuccessDetails self = new DetectQRCodesResponseBodySuccessDetails();
            return TeaModel.build(map, self);
        }

        public DetectQRCodesResponseBodySuccessDetails setSrcUri(String srcUri) {
            this.srcUri = srcUri;
            return this;
        }
        public String getSrcUri() {
            return this.srcUri;
        }

        public DetectQRCodesResponseBodySuccessDetails setQRCodes(java.util.List<DetectQRCodesResponseBodySuccessDetailsQRCodes> QRCodes) {
            this.QRCodes = QRCodes;
            return this;
        }
        public java.util.List<DetectQRCodesResponseBodySuccessDetailsQRCodes> getQRCodes() {
            return this.QRCodes;
        }

    }

    public static class DetectQRCodesResponseBodyFailDetails extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("SrcUri")
        public String srcUri;

        @NameInMap("ErrorCode")
        public String errorCode;

        public static DetectQRCodesResponseBodyFailDetails build(java.util.Map<String, ?> map) throws Exception {
            DetectQRCodesResponseBodyFailDetails self = new DetectQRCodesResponseBodyFailDetails();
            return TeaModel.build(map, self);
        }

        public DetectQRCodesResponseBodyFailDetails setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DetectQRCodesResponseBodyFailDetails setSrcUri(String srcUri) {
            this.srcUri = srcUri;
            return this;
        }
        public String getSrcUri() {
            return this.srcUri;
        }

        public DetectQRCodesResponseBodyFailDetails setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

    }

}
