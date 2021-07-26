// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetConfigurationVariateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetConfigurationVariateResponseBody body;

    public static GetConfigurationVariateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConfigurationVariateResponse self = new GetConfigurationVariateResponse();
        return TeaModel.build(map, self);
    }

    public GetConfigurationVariateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConfigurationVariateResponse setBody(GetConfigurationVariateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConfigurationVariateResponseBody getBody() {
        return this.body;
    }

}
