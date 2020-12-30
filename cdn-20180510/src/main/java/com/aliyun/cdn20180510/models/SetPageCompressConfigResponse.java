// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetPageCompressConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetPageCompressConfigResponseBody body;

    public static SetPageCompressConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetPageCompressConfigResponse self = new SetPageCompressConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetPageCompressConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetPageCompressConfigResponse setBody(SetPageCompressConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetPageCompressConfigResponseBody getBody() {
        return this.body;
    }

}
