// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class Query400NumberManagerIdentifyDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public Query400NumberManagerIdentifyDetailResponseBody body;

    public static Query400NumberManagerIdentifyDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        Query400NumberManagerIdentifyDetailResponse self = new Query400NumberManagerIdentifyDetailResponse();
        return TeaModel.build(map, self);
    }

    public Query400NumberManagerIdentifyDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Query400NumberManagerIdentifyDetailResponse setBody(Query400NumberManagerIdentifyDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public Query400NumberManagerIdentifyDetailResponseBody getBody() {
        return this.body;
    }

}
