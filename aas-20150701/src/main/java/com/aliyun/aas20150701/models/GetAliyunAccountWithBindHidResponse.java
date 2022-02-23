// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class GetAliyunAccountWithBindHidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAliyunAccountWithBindHidResponseBody body;

    public static GetAliyunAccountWithBindHidResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAliyunAccountWithBindHidResponse self = new GetAliyunAccountWithBindHidResponse();
        return TeaModel.build(map, self);
    }

    public GetAliyunAccountWithBindHidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAliyunAccountWithBindHidResponse setBody(GetAliyunAccountWithBindHidResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAliyunAccountWithBindHidResponseBody getBody() {
        return this.body;
    }

}
