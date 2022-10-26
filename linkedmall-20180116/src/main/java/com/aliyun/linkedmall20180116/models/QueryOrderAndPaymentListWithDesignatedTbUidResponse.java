// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderAndPaymentListWithDesignatedTbUidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOrderAndPaymentListWithDesignatedTbUidResponseBody body;

    public static QueryOrderAndPaymentListWithDesignatedTbUidResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderAndPaymentListWithDesignatedTbUidResponse self = new QueryOrderAndPaymentListWithDesignatedTbUidResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderAndPaymentListWithDesignatedTbUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOrderAndPaymentListWithDesignatedTbUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOrderAndPaymentListWithDesignatedTbUidResponse setBody(QueryOrderAndPaymentListWithDesignatedTbUidResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrderAndPaymentListWithDesignatedTbUidResponseBody getBody() {
        return this.body;
    }

}
