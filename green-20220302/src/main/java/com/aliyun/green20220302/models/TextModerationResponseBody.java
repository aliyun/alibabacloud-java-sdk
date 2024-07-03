// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class TextModerationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public TextModerationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TextModerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TextModerationResponseBody self = new TextModerationResponseBody();
        return TeaModel.build(map, self);
    }

    public TextModerationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public TextModerationResponseBody setData(TextModerationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TextModerationResponseBodyData getData() {
        return this.data;
    }

    public TextModerationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TextModerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TextModerationResponseBodyData extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        @NameInMap("deviceId")
        public String deviceId;

        /**
         * <strong>example:</strong>
         * <p>porn</p>
         */
        @NameInMap("labels")
        public String labels;

        @NameInMap("reason")
        public String reason;

        public static TextModerationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TextModerationResponseBodyData self = new TextModerationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TextModerationResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public TextModerationResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public TextModerationResponseBodyData setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public TextModerationResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

}
