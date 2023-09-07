// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class InviteSubAccountResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public InviteSubAccountResponseBodyResults results;

    @NameInMap("Success")
    public Boolean success;

    public static InviteSubAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InviteSubAccountResponseBody self = new InviteSubAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public InviteSubAccountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InviteSubAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InviteSubAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InviteSubAccountResponseBody setResults(InviteSubAccountResponseBodyResults results) {
        this.results = results;
        return this;
    }
    public InviteSubAccountResponseBodyResults getResults() {
        return this.results;
    }

    public InviteSubAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class InviteSubAccountResponseBodyResultsResultResult extends TeaModel {
        @NameInMap("Days")
        public Integer days;

        @NameInMap("InviteId")
        public Long inviteId;

        @NameInMap("RegUrl")
        public String regUrl;

        public static InviteSubAccountResponseBodyResultsResultResult build(java.util.Map<String, ?> map) throws Exception {
            InviteSubAccountResponseBodyResultsResultResult self = new InviteSubAccountResponseBodyResultsResultResult();
            return TeaModel.build(map, self);
        }

        public InviteSubAccountResponseBodyResultsResultResult setDays(Integer days) {
            this.days = days;
            return this;
        }
        public Integer getDays() {
            return this.days;
        }

        public InviteSubAccountResponseBodyResultsResultResult setInviteId(Long inviteId) {
            this.inviteId = inviteId;
            return this;
        }
        public Long getInviteId() {
            return this.inviteId;
        }

        public InviteSubAccountResponseBodyResultsResultResult setRegUrl(String regUrl) {
            this.regUrl = regUrl;
            return this;
        }
        public String getRegUrl() {
            return this.regUrl;
        }

    }

    public static class InviteSubAccountResponseBodyResultsResult extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Result")
        public InviteSubAccountResponseBodyResultsResultResult result;

        @NameInMap("Success")
        public Boolean success;

        public static InviteSubAccountResponseBodyResultsResult build(java.util.Map<String, ?> map) throws Exception {
            InviteSubAccountResponseBodyResultsResult self = new InviteSubAccountResponseBodyResultsResult();
            return TeaModel.build(map, self);
        }

        public InviteSubAccountResponseBodyResultsResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public InviteSubAccountResponseBodyResultsResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public InviteSubAccountResponseBodyResultsResult setResult(InviteSubAccountResponseBodyResultsResultResult result) {
            this.result = result;
            return this;
        }
        public InviteSubAccountResponseBodyResultsResultResult getResult() {
            return this.result;
        }

        public InviteSubAccountResponseBodyResultsResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class InviteSubAccountResponseBodyResults extends TeaModel {
        @NameInMap("Result")
        public java.util.List<InviteSubAccountResponseBodyResultsResult> result;

        public static InviteSubAccountResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            InviteSubAccountResponseBodyResults self = new InviteSubAccountResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public InviteSubAccountResponseBodyResults setResult(java.util.List<InviteSubAccountResponseBodyResultsResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<InviteSubAccountResponseBodyResultsResult> getResult() {
            return this.result;
        }

    }

}
