// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class IdentifyAccountModifyRiskResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public IdentifyAccountModifyRiskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static IdentifyAccountModifyRiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IdentifyAccountModifyRiskResponseBody self = new IdentifyAccountModifyRiskResponseBody();
        return TeaModel.build(map, self);
    }

    public IdentifyAccountModifyRiskResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public IdentifyAccountModifyRiskResponseBody setData(IdentifyAccountModifyRiskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public IdentifyAccountModifyRiskResponseBodyData getData() {
        return this.data;
    }

    public IdentifyAccountModifyRiskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IdentifyAccountModifyRiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IdentifyAccountModifyRiskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class IdentifyAccountModifyRiskResponseBodyData extends TeaModel {
        @NameInMap("AsToken")
        public String asToken;

        @NameInMap("Suggestion")
        public String suggestion;

        public static IdentifyAccountModifyRiskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            IdentifyAccountModifyRiskResponseBodyData self = new IdentifyAccountModifyRiskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public IdentifyAccountModifyRiskResponseBodyData setAsToken(String asToken) {
            this.asToken = asToken;
            return this;
        }
        public String getAsToken() {
            return this.asToken;
        }

        public IdentifyAccountModifyRiskResponseBodyData setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

}
