// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class QueryAccessorDomainsStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<QueryAccessorDomainsStatusResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryAccessorDomainsStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAccessorDomainsStatusResponseBody self = new QueryAccessorDomainsStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAccessorDomainsStatusResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryAccessorDomainsStatusResponseBody setData(java.util.List<QueryAccessorDomainsStatusResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryAccessorDomainsStatusResponseBodyData> getData() {
        return this.data;
    }

    public QueryAccessorDomainsStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAccessorDomainsStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryAccessorDomainsStatusResponseBodyData extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("ReasonCode")
        public Integer reasonCode;

        @NameInMap("Status")
        public String status;

        public static QueryAccessorDomainsStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAccessorDomainsStatusResponseBodyData self = new QueryAccessorDomainsStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAccessorDomainsStatusResponseBodyData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public QueryAccessorDomainsStatusResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public QueryAccessorDomainsStatusResponseBodyData setReasonCode(Integer reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public Integer getReasonCode() {
            return this.reasonCode;
        }

        public QueryAccessorDomainsStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
