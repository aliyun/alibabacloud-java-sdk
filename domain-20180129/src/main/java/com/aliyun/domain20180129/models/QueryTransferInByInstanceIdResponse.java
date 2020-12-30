// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryTransferInByInstanceIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTransferInByInstanceIdResponseBody body;

    public static QueryTransferInByInstanceIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTransferInByInstanceIdResponse self = new QueryTransferInByInstanceIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryTransferInByInstanceIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTransferInByInstanceIdResponse setBody(QueryTransferInByInstanceIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTransferInByInstanceIdResponseBody getBody() {
        return this.body;
    }

}
