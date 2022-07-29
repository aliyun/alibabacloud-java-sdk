// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryItemInventoryV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryItemInventoryV2ResponseBody body;

    public static QueryItemInventoryV2Response build(java.util.Map<String, ?> map) throws Exception {
        QueryItemInventoryV2Response self = new QueryItemInventoryV2Response();
        return TeaModel.build(map, self);
    }

    public QueryItemInventoryV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryItemInventoryV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryItemInventoryV2Response setBody(QueryItemInventoryV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryItemInventoryV2ResponseBody getBody() {
        return this.body;
    }

}
