// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCallInPoolTransferConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCallInPoolTransferConfigResponseBody body;

    public static QueryCallInPoolTransferConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCallInPoolTransferConfigResponse self = new QueryCallInPoolTransferConfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryCallInPoolTransferConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCallInPoolTransferConfigResponse setBody(QueryCallInPoolTransferConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCallInPoolTransferConfigResponseBody getBody() {
        return this.body;
    }

}
