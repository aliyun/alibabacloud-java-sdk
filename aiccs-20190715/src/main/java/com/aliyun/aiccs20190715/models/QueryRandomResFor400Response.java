// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryRandomResFor400Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRandomResFor400ResponseBody body;

    public static QueryRandomResFor400Response build(java.util.Map<String, ?> map) throws Exception {
        QueryRandomResFor400Response self = new QueryRandomResFor400Response();
        return TeaModel.build(map, self);
    }

    public QueryRandomResFor400Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRandomResFor400Response setBody(QueryRandomResFor400ResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRandomResFor400ResponseBody getBody() {
        return this.body;
    }

}
