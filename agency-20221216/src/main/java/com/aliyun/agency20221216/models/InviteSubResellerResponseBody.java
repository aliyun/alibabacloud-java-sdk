// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class InviteSubResellerResponseBody extends TeaModel {
    /**
     * <p>The result code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>message</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The invitation result information.</p>
     */
    @NameInMap("Results")
    public java.util.List<InviteSubResellerResponseBodyResults> results;

    /**
     * <p>Indicates whether the call is successful.</p>
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
         * <p>The validity period of the registration URL, in days.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Days")
        public Integer days;

        /**
         * <p>The invitation ID, which is used to query the invitation status.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("InviteId")
        public Long inviteId;

        /**
         * <p>The registration URL of the T2 Reseller.</p>
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
         * <p>The error code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The prompt message that describes the code.</p>
         * 
         * <strong>example:</strong>
         * <p>成功</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The invitation result details.</p>
         */
        @NameInMap("Result")
        public InviteSubResellerResponseBodyResultsResult result;

        /**
         * <p>Always true.</p>
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
