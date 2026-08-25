// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class QueryQwenConferenceSgTicketSearchPopResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryQwenConferenceSgTicketSearchPopResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryQwenConferenceSgTicketSearchPopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryQwenConferenceSgTicketSearchPopResponseBody self = new QueryQwenConferenceSgTicketSearchPopResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryQwenConferenceSgTicketSearchPopResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryQwenConferenceSgTicketSearchPopResponseBody setData(java.util.List<QueryQwenConferenceSgTicketSearchPopResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryQwenConferenceSgTicketSearchPopResponseBodyData> getData() {
        return this.data;
    }

    public QueryQwenConferenceSgTicketSearchPopResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryQwenConferenceSgTicketSearchPopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryQwenConferenceSgTicketSearchPopResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryQwenConferenceSgTicketSearchPopResponseBodyData extends TeaModel {
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

        public static QueryQwenConferenceSgTicketSearchPopResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryQwenConferenceSgTicketSearchPopResponseBodyData self = new QueryQwenConferenceSgTicketSearchPopResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryQwenConferenceSgTicketSearchPopResponseBodyData setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

        public QueryQwenConferenceSgTicketSearchPopResponseBodyData setExtFields(String extFields) {
            this.extFields = extFields;
            return this;
        }
        public String getExtFields() {
            return this.extFields;
        }

        public QueryQwenConferenceSgTicketSearchPopResponseBodyData setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public QueryQwenConferenceSgTicketSearchPopResponseBodyData setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public QueryQwenConferenceSgTicketSearchPopResponseBodyData setSubmitId(Long submitId) {
            this.submitId = submitId;
            return this;
        }
        public Long getSubmitId() {
            return this.submitId;
        }

        public QueryQwenConferenceSgTicketSearchPopResponseBodyData setTicketToken(String ticketToken) {
            this.ticketToken = ticketToken;
            return this;
        }
        public String getTicketToken() {
            return this.ticketToken;
        }

    }

}
