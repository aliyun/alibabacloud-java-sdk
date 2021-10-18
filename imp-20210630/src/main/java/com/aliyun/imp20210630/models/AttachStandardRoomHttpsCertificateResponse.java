// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class AttachStandardRoomHttpsCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AttachStandardRoomHttpsCertificateResponseBody body;

    public static AttachStandardRoomHttpsCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachStandardRoomHttpsCertificateResponse self = new AttachStandardRoomHttpsCertificateResponse();
        return TeaModel.build(map, self);
    }

    public AttachStandardRoomHttpsCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachStandardRoomHttpsCertificateResponse setBody(AttachStandardRoomHttpsCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachStandardRoomHttpsCertificateResponseBody getBody() {
        return this.body;
    }

}
