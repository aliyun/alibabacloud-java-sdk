// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class SendRuntimeQrCodeConfigChannelMessageResponseBody extends TeaModel {
    /**
     * <p>The list of sending results for each runtime. Each runtime corresponds to one result. The return order is not guaranteed to be the same as the order of RuntimeIds in the request. Match the results by RuntimeId.</p>
     */
    @NameInMap("Data")
    public java.util.List<SendRuntimeQrCodeConfigChannelMessageResponseBodyData> data;

    /**
     * <p>The request ID, which is a unique identifier for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned sending results, which is the same as the number of results in Data.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static SendRuntimeQrCodeConfigChannelMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendRuntimeQrCodeConfigChannelMessageResponseBody self = new SendRuntimeQrCodeConfigChannelMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public SendRuntimeQrCodeConfigChannelMessageResponseBody setData(java.util.List<SendRuntimeQrCodeConfigChannelMessageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SendRuntimeQrCodeConfigChannelMessageResponseBodyData> getData() {
        return this.data;
    }

    public SendRuntimeQrCodeConfigChannelMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendRuntimeQrCodeConfigChannelMessageResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class SendRuntimeQrCodeConfigChannelMessageResponseBodyData extends TeaModel {
        /**
         * <p>The error code when the sending fails, such as Runtime.NotFound (the runtime does not exist) or Runtime.UserNotSupported (the runtime has no authorized user or has multiple authorized users). This parameter is not returned when the sending is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Runtime.UserNotSupported</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The error message when the sending fails. This parameter is not returned when the sending is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Runtime has no authorized user</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The access URL of the QR code configuration channel page. It carries the taskId, channel code, and region parameters for the current process, and has been sent to the authorized user of the runtime by email and SMS. This parameter is returned only when the sending is successful. The taskId is valid for 1 hour.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://eds.console.aliyun.com/public/scan-pair?taskId=8f14e45f-ceea-4672-9f6e-3c5b2a1d****&code=feishu&region=cn-shanghai">https://eds.console.aliyun.com/public/scan-pair?taskId=8f14e45f-ceea-4672-9f6e-3c5b2a1d****&amp;code=feishu&amp;region=cn-shanghai</a></p>
         */
        @NameInMap("QrCodeNotifyUrl")
        public String qrCodeNotifyUrl;

        /**
         * <p>The ID of the runtime resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-xgads</p>
         */
        @NameInMap("RuntimeId")
        public String runtimeId;

        /**
         * <p>Indicates whether the QR code configuration channel message for the runtime was initiated successfully. If the value is false, you can check the Code and Message fields for the cause of the failure.</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static SendRuntimeQrCodeConfigChannelMessageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendRuntimeQrCodeConfigChannelMessageResponseBodyData self = new SendRuntimeQrCodeConfigChannelMessageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendRuntimeQrCodeConfigChannelMessageResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SendRuntimeQrCodeConfigChannelMessageResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SendRuntimeQrCodeConfigChannelMessageResponseBodyData setQrCodeNotifyUrl(String qrCodeNotifyUrl) {
            this.qrCodeNotifyUrl = qrCodeNotifyUrl;
            return this;
        }
        public String getQrCodeNotifyUrl() {
            return this.qrCodeNotifyUrl;
        }

        public SendRuntimeQrCodeConfigChannelMessageResponseBodyData setRuntimeId(String runtimeId) {
            this.runtimeId = runtimeId;
            return this;
        }
        public String getRuntimeId() {
            return this.runtimeId;
        }

        public SendRuntimeQrCodeConfigChannelMessageResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
