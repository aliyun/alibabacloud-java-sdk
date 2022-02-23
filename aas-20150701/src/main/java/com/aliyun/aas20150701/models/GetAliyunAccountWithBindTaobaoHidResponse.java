// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class GetAliyunAccountWithBindTaobaoHidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAliyunAccountWithBindTaobaoHidResponseBody body;

    public static GetAliyunAccountWithBindTaobaoHidResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAliyunAccountWithBindTaobaoHidResponse self = new GetAliyunAccountWithBindTaobaoHidResponse();
        return TeaModel.build(map, self);
    }

    public GetAliyunAccountWithBindTaobaoHidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAliyunAccountWithBindTaobaoHidResponse setBody(GetAliyunAccountWithBindTaobaoHidResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAliyunAccountWithBindTaobaoHidResponseBody getBody() {
        return this.body;
    }

}
