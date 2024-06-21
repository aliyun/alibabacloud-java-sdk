// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreatePhoneMessageQrdlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreatePhoneMessageQrdlResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request。</p>
     * 
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A94866411B2O</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePhoneMessageQrdlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePhoneMessageQrdlResponseBody self = new CreatePhoneMessageQrdlResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePhoneMessageQrdlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePhoneMessageQrdlResponseBody setData(CreatePhoneMessageQrdlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreatePhoneMessageQrdlResponseBodyData getData() {
        return this.data;
    }

    public CreatePhoneMessageQrdlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePhoneMessageQrdlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreatePhoneMessageQrdlResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://wa.qrdl/">https://wa.qrdl/</a></p>
         */
        @NameInMap("DeepLinkUrl")
        public String deepLinkUrl;

        /**
         * <strong>example:</strong>
         * <p>PNG</p>
         */
        @NameInMap("GenerateQrImage")
        public String generateQrImage;

        /**
         * <strong>example:</strong>
         * <p>8613800</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <strong>example:</strong>
         * <p>Hello</p>
         */
        @NameInMap("PrefilledMessage")
        public String prefilledMessage;

        /**
         * <strong>example:</strong>
         * <p><a href="http://img.png">http://img.png</a></p>
         */
        @NameInMap("QrImageUrl")
        public String qrImageUrl;

        /**
         * <strong>example:</strong>
         * <p>D9II3***</p>
         */
        @NameInMap("QrdlCode")
        public String qrdlCode;

        public static CreatePhoneMessageQrdlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreatePhoneMessageQrdlResponseBodyData self = new CreatePhoneMessageQrdlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreatePhoneMessageQrdlResponseBodyData setDeepLinkUrl(String deepLinkUrl) {
            this.deepLinkUrl = deepLinkUrl;
            return this;
        }
        public String getDeepLinkUrl() {
            return this.deepLinkUrl;
        }

        public CreatePhoneMessageQrdlResponseBodyData setGenerateQrImage(String generateQrImage) {
            this.generateQrImage = generateQrImage;
            return this;
        }
        public String getGenerateQrImage() {
            return this.generateQrImage;
        }

        public CreatePhoneMessageQrdlResponseBodyData setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public CreatePhoneMessageQrdlResponseBodyData setPrefilledMessage(String prefilledMessage) {
            this.prefilledMessage = prefilledMessage;
            return this;
        }
        public String getPrefilledMessage() {
            return this.prefilledMessage;
        }

        public CreatePhoneMessageQrdlResponseBodyData setQrImageUrl(String qrImageUrl) {
            this.qrImageUrl = qrImageUrl;
            return this;
        }
        public String getQrImageUrl() {
            return this.qrImageUrl;
        }

        public CreatePhoneMessageQrdlResponseBodyData setQrdlCode(String qrdlCode) {
            this.qrdlCode = qrdlCode;
            return this;
        }
        public String getQrdlCode() {
            return this.qrdlCode;
        }

    }

}
