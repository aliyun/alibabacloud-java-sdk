// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryRefundApplyWithDesignatedTbUidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRefundApplyWithDesignatedTbUidResponseBody body;

    public static QueryRefundApplyWithDesignatedTbUidResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRefundApplyWithDesignatedTbUidResponse self = new QueryRefundApplyWithDesignatedTbUidResponse();
        return TeaModel.build(map, self);
    }

    public QueryRefundApplyWithDesignatedTbUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRefundApplyWithDesignatedTbUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRefundApplyWithDesignatedTbUidResponse setBody(QueryRefundApplyWithDesignatedTbUidResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRefundApplyWithDesignatedTbUidResponseBody getBody() {
        return this.body;
    }

}
