// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class TextModerationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public TextModerationResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static TextModerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TextModerationResponseBody self = new TextModerationResponseBody();
        return TeaModel.build(map, self);
    }

    public TextModerationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
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
        @NameInMap("labels")
        public String labels;

        @NameInMap("reason")
        public String reason;

        @NameInMap("suggestion")
        public String suggestion;

        public static TextModerationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TextModerationResponseBodyData self = new TextModerationResponseBodyData();
            return TeaModel.build(map, self);
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

        public TextModerationResponseBodyData setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

}
