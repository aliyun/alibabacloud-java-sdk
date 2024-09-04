// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class InviteSubAccountResponseBody extends TeaModel {
    /**
     * <p>Error Code: </br>
     * • 200 OK</br>
     * • 1109 System Error</br></p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Message</br></p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID, Alibaba Cloud will track errors with this ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>List of invitation sending results</p>
     */
    @NameInMap("Results")
    public InviteSubAccountResponseBodyResults results;

    /**
     * <p>Candidate Values: True/False, this value states if the current API calling action is successful. It does not guarantee the success of subsequent business operations.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Valid days of registration URL, count on daily basis.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Days")
        public Integer days;

        /**
         * <p>Invitation ID, The invitation status tracking code.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("InviteId")
        public Long inviteId;

        /**
         * <p>URL for Partner Customer Registration.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://agency-intl.console.aliyun.com/customer/register?intl=true&fxinfo=-4uT%2FMWHnnUdvr5GXVd1AYK8luTnGgH3M7Y3lSCd5M1fxRwAkViTWtDJDpckh0HL">http://agency-intl.console.aliyun.com/customer/register?intl=true&amp;fxinfo=-4uT%2FMWHnnUdvr5GXVd1AYK8luTnGgH3M7Y3lSCd5M1fxRwAkViTWtDJDpckh0HL</a></p>
         */
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
        /**
         * <p>Error Code, 200 OK</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Message, Notes of Code</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Returning Message of Invitation Results</p>
         */
        @NameInMap("Result")
        public InviteSubAccountResponseBodyResultsResultResult result;

        /**
         * <p>Always true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
