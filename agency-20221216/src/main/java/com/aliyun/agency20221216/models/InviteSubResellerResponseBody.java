// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class InviteSubResellerResponseBody extends TeaModel {
    /**
     * <p>Result code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Message.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>邀请结果信息</p>
     */
    @NameInMap("Results")
    public java.util.List<InviteSubResellerResponseBodyResults> results;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static InviteSubResellerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InviteSubResellerResponseBody self = new InviteSubResellerResponseBody();
        return TeaModel.build(map, self);
    }

    public InviteSubResellerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InviteSubResellerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InviteSubResellerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InviteSubResellerResponseBody setResults(java.util.List<InviteSubResellerResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<InviteSubResellerResponseBodyResults> getResults() {
        return this.results;
    }

    public InviteSubResellerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class InviteSubResellerResponseBodyResultsResult extends TeaModel {
        /**
         * <p>Validity period of the registration URL, in days</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Days")
        public Integer days;

        /**
         * <p>Invitation ID, used for querying the invitation status</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("InviteId")
        public Long inviteId;

        /**
         * <p>T2 Reseller registration URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://agency-intl.console.aliyun.com/customer/register?intl=true&fxinfo=XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX">http://agency-intl.console.aliyun.com/customer/register?intl=true&amp;fxinfo=XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX</a></p>
         */
        @NameInMap("RegUrl")
        public String regUrl;

        public static InviteSubResellerResponseBodyResultsResult build(java.util.Map<String, ?> map) throws Exception {
            InviteSubResellerResponseBodyResultsResult self = new InviteSubResellerResponseBodyResultsResult();
            return TeaModel.build(map, self);
        }

        public InviteSubResellerResponseBodyResultsResult setDays(Integer days) {
            this.days = days;
            return this;
        }
        public Integer getDays() {
            return this.days;
        }

        public InviteSubResellerResponseBodyResultsResult setInviteId(Long inviteId) {
            this.inviteId = inviteId;
            return this;
        }
        public Long getInviteId() {
            return this.inviteId;
        }

        public InviteSubResellerResponseBodyResultsResult setRegUrl(String regUrl) {
            this.regUrl = regUrl;
            return this;
        }
        public String getRegUrl() {
            return this.regUrl;
        }

    }

    public static class InviteSubResellerResponseBodyResults extends TeaModel {
        /**
         * <p>Error code, 200 OK</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Prompt message, explanation of the code</p>
         * 
         * <strong>example:</strong>
         * <p>成功</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Returned invitation result information</p>
         */
        @NameInMap("Result")
        public InviteSubResellerResponseBodyResultsResult result;

        /**
         * <p>Always true</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static InviteSubResellerResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            InviteSubResellerResponseBodyResults self = new InviteSubResellerResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public InviteSubResellerResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public InviteSubResellerResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public InviteSubResellerResponseBodyResults setResult(InviteSubResellerResponseBodyResultsResult result) {
            this.result = result;
            return this;
        }
        public InviteSubResellerResponseBodyResultsResult getResult() {
            return this.result;
        }

        public InviteSubResellerResponseBodyResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
