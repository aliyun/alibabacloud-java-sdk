// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class QueryAccessorDomainListResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public QueryAccessorDomainListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryAccessorDomainListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAccessorDomainListResponseBody self = new QueryAccessorDomainListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAccessorDomainListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryAccessorDomainListResponseBody setData(QueryAccessorDomainListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAccessorDomainListResponseBodyData getData() {
        return this.data;
    }

    public QueryAccessorDomainListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAccessorDomainListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryAccessorDomainListResponseBodyData extends TeaModel {
        @NameInMap("Domains")
        public java.util.List<String> domains;

        public static QueryAccessorDomainListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAccessorDomainListResponseBodyData self = new QueryAccessorDomainListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAccessorDomainListResponseBodyData setDomains(java.util.List<String> domains) {
            this.domains = domains;
            return this;
        }
        public java.util.List<String> getDomains() {
            return this.domains;
        }

    }

}
