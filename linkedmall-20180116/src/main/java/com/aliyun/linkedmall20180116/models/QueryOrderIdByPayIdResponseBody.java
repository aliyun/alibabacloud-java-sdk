// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderIdByPayIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LmOrderIds")
    public QueryOrderIdByPayIdResponseBodyLmOrderIds lmOrderIds;

    public static QueryOrderIdByPayIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderIdByPayIdResponseBody self = new QueryOrderIdByPayIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrderIdByPayIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOrderIdByPayIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOrderIdByPayIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrderIdByPayIdResponseBody setLmOrderIds(QueryOrderIdByPayIdResponseBodyLmOrderIds lmOrderIds) {
        this.lmOrderIds = lmOrderIds;
        return this;
    }
    public QueryOrderIdByPayIdResponseBodyLmOrderIds getLmOrderIds() {
        return this.lmOrderIds;
    }

    public static class QueryOrderIdByPayIdResponseBodyLmOrderIdsLmOrderIds extends TeaModel {
        @NameInMap("LmOrderId")
        public Long lmOrderId;

        public static QueryOrderIdByPayIdResponseBodyLmOrderIdsLmOrderIds build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderIdByPayIdResponseBodyLmOrderIdsLmOrderIds self = new QueryOrderIdByPayIdResponseBodyLmOrderIdsLmOrderIds();
            return TeaModel.build(map, self);
        }

        public QueryOrderIdByPayIdResponseBodyLmOrderIdsLmOrderIds setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

    }

    public static class QueryOrderIdByPayIdResponseBodyLmOrderIds extends TeaModel {
        @NameInMap("LmOrderIds")
        public java.util.List<QueryOrderIdByPayIdResponseBodyLmOrderIdsLmOrderIds> lmOrderIds;

        public static QueryOrderIdByPayIdResponseBodyLmOrderIds build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderIdByPayIdResponseBodyLmOrderIds self = new QueryOrderIdByPayIdResponseBodyLmOrderIds();
            return TeaModel.build(map, self);
        }

        public QueryOrderIdByPayIdResponseBodyLmOrderIds setLmOrderIds(java.util.List<QueryOrderIdByPayIdResponseBodyLmOrderIdsLmOrderIds> lmOrderIds) {
            this.lmOrderIds = lmOrderIds;
            return this;
        }
        public java.util.List<QueryOrderIdByPayIdResponseBodyLmOrderIdsLmOrderIds> getLmOrderIds() {
            return this.lmOrderIds;
        }

    }

}
