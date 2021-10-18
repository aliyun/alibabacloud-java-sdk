// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetStandardRoomHttpsCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetStandardRoomHttpsCertificateResponseBody body;

    public static GetStandardRoomHttpsCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStandardRoomHttpsCertificateResponse self = new GetStandardRoomHttpsCertificateResponse();
        return TeaModel.build(map, self);
    }

    public GetStandardRoomHttpsCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStandardRoomHttpsCertificateResponse setBody(GetStandardRoomHttpsCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStandardRoomHttpsCertificateResponseBody getBody() {
        return this.body;
    }

}
