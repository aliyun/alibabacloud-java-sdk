// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderIdByPayIdResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("LmOrderIds")
    @Validation(required = true)
    public QueryOrderIdByPayIdResponseLmOrderIds lmOrderIds;

    public static QueryOrderIdByPayIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderIdByPayIdResponse self = new QueryOrderIdByPayIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderIdByPayIdResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrderIdByPayIdResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOrderIdByPayIdResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOrderIdByPayIdResponse setLmOrderIds(QueryOrderIdByPayIdResponseLmOrderIds lmOrderIds) {
        this.lmOrderIds = lmOrderIds;
        return this;
    }
    public QueryOrderIdByPayIdResponseLmOrderIds getLmOrderIds() {
        return this.lmOrderIds;
    }

    public static class QueryOrderIdByPayIdResponseLmOrderIdsLmOrderIds extends TeaModel {
        @NameInMap("LmOrderId")
        @Validation(required = true)
        public Long lmOrderId;

        public static QueryOrderIdByPayIdResponseLmOrderIdsLmOrderIds build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderIdByPayIdResponseLmOrderIdsLmOrderIds self = new QueryOrderIdByPayIdResponseLmOrderIdsLmOrderIds();
            return TeaModel.build(map, self);
        }

        public QueryOrderIdByPayIdResponseLmOrderIdsLmOrderIds setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

    }

    public static class QueryOrderIdByPayIdResponseLmOrderIds extends TeaModel {
        @NameInMap("LmOrderIds")
        @Validation(required = true)
        public java.util.List<QueryOrderIdByPayIdResponseLmOrderIdsLmOrderIds> lmOrderIds;

        public static QueryOrderIdByPayIdResponseLmOrderIds build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderIdByPayIdResponseLmOrderIds self = new QueryOrderIdByPayIdResponseLmOrderIds();
            return TeaModel.build(map, self);
        }

        public QueryOrderIdByPayIdResponseLmOrderIds setLmOrderIds(java.util.List<QueryOrderIdByPayIdResponseLmOrderIdsLmOrderIds> lmOrderIds) {
            this.lmOrderIds = lmOrderIds;
            return this;
        }
        public java.util.List<QueryOrderIdByPayIdResponseLmOrderIdsLmOrderIds> getLmOrderIds() {
            return this.lmOrderIds;
        }

    }

}
