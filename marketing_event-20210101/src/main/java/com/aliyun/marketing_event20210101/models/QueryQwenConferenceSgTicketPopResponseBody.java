// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class QueryQwenConferenceSgTicketPopResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryQwenConferenceSgTicketPopResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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

        @NameInMap("ExtFields")
        public String extFields;

        @NameInMap("FirstName")
        public String firstName;

        @NameInMap("LastName")
        public String lastName;

        @NameInMap("SubmitId")
        public Long submitId;

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
