// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FTApiAliasApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FTApiAliasApiResponseBody body;

    public static FTApiAliasApiResponse build(java.util.Map<String, ?> map) throws Exception {
        FTApiAliasApiResponse self = new FTApiAliasApiResponse();
        return TeaModel.build(map, self);
    }

    public FTApiAliasApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FTApiAliasApiResponse setBody(FTApiAliasApiResponseBody body) {
        this.body = body;
        return this;
    }
    public FTApiAliasApiResponseBody getBody() {
        return this.body;
    }

}
