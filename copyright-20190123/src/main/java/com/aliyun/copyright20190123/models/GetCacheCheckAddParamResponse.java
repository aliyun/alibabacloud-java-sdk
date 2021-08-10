// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetCacheCheckAddParamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCacheCheckAddParamResponseBody body;

    public static GetCacheCheckAddParamResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCacheCheckAddParamResponse self = new GetCacheCheckAddParamResponse();
        return TeaModel.build(map, self);
    }

    public GetCacheCheckAddParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCacheCheckAddParamResponse setBody(GetCacheCheckAddParamResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCacheCheckAddParamResponseBody getBody() {
        return this.body;
    }

}
