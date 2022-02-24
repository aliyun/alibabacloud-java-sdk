// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class QueryRskStatisticResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRskStatisticResponseBody body;

    public static QueryRskStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRskStatisticResponse self = new QueryRskStatisticResponse();
        return TeaModel.build(map, self);
    }

    public QueryRskStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRskStatisticResponse setBody(QueryRskStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRskStatisticResponseBody getBody() {
        return this.body;
    }

}
