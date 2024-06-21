// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListPhoneMessageQrdlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListPhoneMessageQrdlResponseBodyData> data;

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

    public static ListPhoneMessageQrdlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPhoneMessageQrdlResponseBody self = new ListPhoneMessageQrdlResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPhoneMessageQrdlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPhoneMessageQrdlResponseBody setData(java.util.List<ListPhoneMessageQrdlResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPhoneMessageQrdlResponseBodyData> getData() {
        return this.data;
    }

    public ListPhoneMessageQrdlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPhoneMessageQrdlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPhoneMessageQrdlResponseBodyData extends TeaModel {
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
         * <p>IUIED999</p>
         */
        @NameInMap("QrdlCode")
        public String qrdlCode;

        public static ListPhoneMessageQrdlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPhoneMessageQrdlResponseBodyData self = new ListPhoneMessageQrdlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPhoneMessageQrdlResponseBodyData setDeepLinkUrl(String deepLinkUrl) {
            this.deepLinkUrl = deepLinkUrl;
            return this;
        }
        public String getDeepLinkUrl() {
            return this.deepLinkUrl;
        }

        public ListPhoneMessageQrdlResponseBodyData setGenerateQrImage(String generateQrImage) {
            this.generateQrImage = generateQrImage;
            return this;
        }
        public String getGenerateQrImage() {
            return this.generateQrImage;
        }

        public ListPhoneMessageQrdlResponseBodyData setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public ListPhoneMessageQrdlResponseBodyData setPrefilledMessage(String prefilledMessage) {
            this.prefilledMessage = prefilledMessage;
            return this;
        }
        public String getPrefilledMessage() {
            return this.prefilledMessage;
        }

        public ListPhoneMessageQrdlResponseBodyData setQrImageUrl(String qrImageUrl) {
            this.qrImageUrl = qrImageUrl;
            return this;
        }
        public String getQrImageUrl() {
            return this.qrImageUrl;
        }

        public ListPhoneMessageQrdlResponseBodyData setQrdlCode(String qrdlCode) {
            this.qrdlCode = qrdlCode;
            return this;
        }
        public String getQrdlCode() {
            return this.qrdlCode;
        }

    }

}
