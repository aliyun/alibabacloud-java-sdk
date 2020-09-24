// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class RecycleApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecycleApiResponseBody body;

    public static RecycleApiResponse build(java.util.Map<String, ?> map) throws Exception {
        RecycleApiResponse self = new RecycleApiResponse();
        return TeaModel.build(map, self);
    }

    public RecycleApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecycleApiResponse setBody(RecycleApiResponseBody body) {
        this.body = body;
        return this;
    }
    public RecycleApiResponseBody getBody() {
        return this.body;
    }

}
