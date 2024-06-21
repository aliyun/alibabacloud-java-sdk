// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdatePhoneMessageQrdlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdatePhoneMessageQrdlResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request。</p>
     * 
     * <strong>example:</strong>
     * <p>1612C226-E271-4CFE-9F18-4066D******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePhoneMessageQrdlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePhoneMessageQrdlResponseBody self = new UpdatePhoneMessageQrdlResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePhoneMessageQrdlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdatePhoneMessageQrdlResponseBody setData(UpdatePhoneMessageQrdlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdatePhoneMessageQrdlResponseBodyData getData() {
        return this.data;
    }

    public UpdatePhoneMessageQrdlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdatePhoneMessageQrdlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdatePhoneMessageQrdlResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://wa.msg/">https://wa.msg/</a></p>
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
         * <p><a href="https://img.png">https://img.png</a></p>
         */
        @NameInMap("QrImageUrl")
        public String qrImageUrl;

        /**
         * <strong>example:</strong>
         * <p>DEDEE998</p>
         */
        @NameInMap("QrdlCode")
        public String qrdlCode;

        public static UpdatePhoneMessageQrdlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdatePhoneMessageQrdlResponseBodyData self = new UpdatePhoneMessageQrdlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdatePhoneMessageQrdlResponseBodyData setDeepLinkUrl(String deepLinkUrl) {
            this.deepLinkUrl = deepLinkUrl;
            return this;
        }
        public String getDeepLinkUrl() {
            return this.deepLinkUrl;
        }

        public UpdatePhoneMessageQrdlResponseBodyData setGenerateQrImage(String generateQrImage) {
            this.generateQrImage = generateQrImage;
            return this;
        }
        public String getGenerateQrImage() {
            return this.generateQrImage;
        }

        public UpdatePhoneMessageQrdlResponseBodyData setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public UpdatePhoneMessageQrdlResponseBodyData setPrefilledMessage(String prefilledMessage) {
            this.prefilledMessage = prefilledMessage;
            return this;
        }
        public String getPrefilledMessage() {
            return this.prefilledMessage;
        }

        public UpdatePhoneMessageQrdlResponseBodyData setQrImageUrl(String qrImageUrl) {
            this.qrImageUrl = qrImageUrl;
            return this;
        }
        public String getQrImageUrl() {
            return this.qrImageUrl;
        }

        public UpdatePhoneMessageQrdlResponseBodyData setQrdlCode(String qrdlCode) {
            this.qrdlCode = qrdlCode;
            return this;
        }
        public String getQrdlCode() {
            return this.qrdlCode;
        }

    }

}
