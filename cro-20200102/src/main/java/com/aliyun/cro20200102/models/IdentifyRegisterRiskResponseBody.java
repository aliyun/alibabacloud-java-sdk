// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class IdentifyRegisterRiskResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public IdentifyRegisterRiskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static IdentifyRegisterRiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IdentifyRegisterRiskResponseBody self = new IdentifyRegisterRiskResponseBody();
        return TeaModel.build(map, self);
    }

    public IdentifyRegisterRiskResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public IdentifyRegisterRiskResponseBody setData(IdentifyRegisterRiskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public IdentifyRegisterRiskResponseBodyData getData() {
        return this.data;
    }

    public IdentifyRegisterRiskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IdentifyRegisterRiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IdentifyRegisterRiskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class IdentifyRegisterRiskResponseBodyData extends TeaModel {
        @NameInMap("AsToken")
        public String asToken;

        @NameInMap("Suggestion")
        public String suggestion;

        public static IdentifyRegisterRiskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            IdentifyRegisterRiskResponseBodyData self = new IdentifyRegisterRiskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public IdentifyRegisterRiskResponseBodyData setAsToken(String asToken) {
            this.asToken = asToken;
            return this;
        }
        public String getAsToken() {
            return this.asToken;
        }

        public IdentifyRegisterRiskResponseBodyData setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

}
