// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetSenderAddressListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSenderAddressListResponseBody body;

    public static GetSenderAddressListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSenderAddressListResponse self = new GetSenderAddressListResponse();
        return TeaModel.build(map, self);
    }

    public GetSenderAddressListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSenderAddressListResponse setBody(GetSenderAddressListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSenderAddressListResponseBody getBody() {
        return this.body;
    }

}
