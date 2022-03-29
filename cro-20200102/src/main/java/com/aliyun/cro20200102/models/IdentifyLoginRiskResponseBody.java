// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class IdentifyLoginRiskResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public IdentifyLoginRiskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static IdentifyLoginRiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IdentifyLoginRiskResponseBody self = new IdentifyLoginRiskResponseBody();
        return TeaModel.build(map, self);
    }

    public IdentifyLoginRiskResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public IdentifyLoginRiskResponseBody setData(IdentifyLoginRiskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public IdentifyLoginRiskResponseBodyData getData() {
        return this.data;
    }

    public IdentifyLoginRiskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IdentifyLoginRiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IdentifyLoginRiskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class IdentifyLoginRiskResponseBodyData extends TeaModel {
        @NameInMap("AsToken")
        public String asToken;

        @NameInMap("Suggestion")
        public String suggestion;

        public static IdentifyLoginRiskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            IdentifyLoginRiskResponseBodyData self = new IdentifyLoginRiskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public IdentifyLoginRiskResponseBodyData setAsToken(String asToken) {
            this.asToken = asToken;
            return this;
        }
        public String getAsToken() {
            return this.asToken;
        }

        public IdentifyLoginRiskResponseBodyData setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

}
