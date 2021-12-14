// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryVoiceNumberStockCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryVoiceNumberStockCountResponseBody body;

    public static QueryVoiceNumberStockCountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryVoiceNumberStockCountResponse self = new QueryVoiceNumberStockCountResponse();
        return TeaModel.build(map, self);
    }

    public QueryVoiceNumberStockCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryVoiceNumberStockCountResponse setBody(QueryVoiceNumberStockCountResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryVoiceNumberStockCountResponseBody getBody() {
        return this.body;
    }

}
