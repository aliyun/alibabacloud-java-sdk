// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class QueryQwenConferenceSgTicketPopResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryQwenConferenceSgTicketPopResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1skladklasmda</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryQwenConferenceSgTicketPopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryQwenConferenceSgTicketPopResponseBody self = new QueryQwenConferenceSgTicketPopResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryQwenConferenceSgTicketPopResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryQwenConferenceSgTicketPopResponseBody setData(QueryQwenConferenceSgTicketPopResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryQwenConferenceSgTicketPopResponseBodyData getData() {
        return this.data;
    }

    public QueryQwenConferenceSgTicketPopResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryQwenConferenceSgTicketPopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryQwenConferenceSgTicketPopResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryQwenConferenceSgTicketPopResponseBodyData extends TeaModel {
        @NameInMap("CompanyName")
        public String companyName;

        /**
         * <strong>example:</strong>
         * <p>placeholder</p>
         */
        @NameInMap("ExtFields")
        public String extFields;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("FirstName")
        public String firstName;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("LastName")
        public String lastName;

        /**
         * <strong>example:</strong>
         * <p>23808009</p>
         */
        @NameInMap("SubmitId")
        public Long submitId;

        /**
         * <strong>example:</strong>
         * <p>bPbXgB8nSzI9UIbdqAWaOhtr7T3p1Ryr</p>
         */
        @NameInMap("TicketToken")
        public String ticketToken;

        public static QueryQwenConferenceSgTicketPopResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryQwenConferenceSgTicketPopResponseBodyData self = new QueryQwenConferenceSgTicketPopResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryQwenConferenceSgTicketPopResponseBodyData setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

        public QueryQwenConferenceSgTicketPopResponseBodyData setExtFields(String extFields) {
            this.extFields = extFields;
            return this;
        }
        public String getExtFields() {
            return this.extFields;
        }

        public QueryQwenConferenceSgTicketPopResponseBodyData setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public QueryQwenConferenceSgTicketPopResponseBodyData setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public QueryQwenConferenceSgTicketPopResponseBodyData setSubmitId(Long submitId) {
            this.submitId = submitId;
            return this;
        }
        public Long getSubmitId() {
            return this.submitId;
        }

        public QueryQwenConferenceSgTicketPopResponseBodyData setTicketToken(String ticketToken) {
            this.ticketToken = ticketToken;
            return this;
        }
        public String getTicketToken() {
            return this.ticketToken;
        }

    }

}
