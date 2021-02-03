// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class GetTxtRecordForVerifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTxtRecordForVerifyResponseBody body;

    public static GetTxtRecordForVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTxtRecordForVerifyResponse self = new GetTxtRecordForVerifyResponse();
        return TeaModel.build(map, self);
    }

    public GetTxtRecordForVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTxtRecordForVerifyResponse setBody(GetTxtRecordForVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTxtRecordForVerifyResponseBody getBody() {
        return this.body;
    }

}
