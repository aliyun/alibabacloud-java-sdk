// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class QueryAccessorDomainStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public QueryAccessorDomainStatusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryAccessorDomainStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAccessorDomainStatusResponseBody self = new QueryAccessorDomainStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAccessorDomainStatusResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryAccessorDomainStatusResponseBody setData(QueryAccessorDomainStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAccessorDomainStatusResponseBodyData getData() {
        return this.data;
    }

    public QueryAccessorDomainStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAccessorDomainStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryAccessorDomainStatusResponseBodyData extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("ReasonCode")
        public Integer reasonCode;

        @NameInMap("Status")
        public String status;

        public static QueryAccessorDomainStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAccessorDomainStatusResponseBodyData self = new QueryAccessorDomainStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAccessorDomainStatusResponseBodyData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public QueryAccessorDomainStatusResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public QueryAccessorDomainStatusResponseBodyData setReasonCode(Integer reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public Integer getReasonCode() {
            return this.reasonCode;
        }

        public QueryAccessorDomainStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
