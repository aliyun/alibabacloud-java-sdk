// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderListWithDesignatedTbUidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOrderListWithDesignatedTbUidResponseBody body;

    public static QueryOrderListWithDesignatedTbUidResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderListWithDesignatedTbUidResponse self = new QueryOrderListWithDesignatedTbUidResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderListWithDesignatedTbUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOrderListWithDesignatedTbUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOrderListWithDesignatedTbUidResponse setBody(QueryOrderListWithDesignatedTbUidResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrderListWithDesignatedTbUidResponseBody getBody() {
        return this.body;
    }

}
