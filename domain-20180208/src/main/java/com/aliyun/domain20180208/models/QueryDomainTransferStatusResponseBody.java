// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryDomainTransferStatusResponseBody extends TeaModel {
    @NameInMap("DomainTransferStatus")
    public java.util.List<QueryDomainTransferStatusResponseBodyDomainTransferStatus> domainTransferStatus;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryDomainTransferStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainTransferStatusResponseBody self = new QueryDomainTransferStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDomainTransferStatusResponseBody setDomainTransferStatus(java.util.List<QueryDomainTransferStatusResponseBodyDomainTransferStatus> domainTransferStatus) {
        this.domainTransferStatus = domainTransferStatus;
        return this;
    }
    public java.util.List<QueryDomainTransferStatusResponseBodyDomainTransferStatus> getDomainTransferStatus() {
        return this.domainTransferStatus;
    }

    public QueryDomainTransferStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryDomainTransferStatusResponseBodyDomainTransferStatus extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainStatusDescription")
        public String domainStatusDescription;

        public static QueryDomainTransferStatusResponseBodyDomainTransferStatus build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainTransferStatusResponseBodyDomainTransferStatus self = new QueryDomainTransferStatusResponseBodyDomainTransferStatus();
            return TeaModel.build(map, self);
        }

        public QueryDomainTransferStatusResponseBodyDomainTransferStatus setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryDomainTransferStatusResponseBodyDomainTransferStatus setDomainStatusDescription(String domainStatusDescription) {
            this.domainStatusDescription = domainStatusDescription;
            return this;
        }
        public String getDomainStatusDescription() {
            return this.domainStatusDescription;
        }

    }

}
