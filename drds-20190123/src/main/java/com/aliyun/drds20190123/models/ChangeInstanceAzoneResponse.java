// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ChangeInstanceAzoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeInstanceAzoneResponseBody body;

    public static ChangeInstanceAzoneResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeInstanceAzoneResponse self = new ChangeInstanceAzoneResponse();
        return TeaModel.build(map, self);
    }

    public ChangeInstanceAzoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeInstanceAzoneResponse setBody(ChangeInstanceAzoneResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeInstanceAzoneResponseBody getBody() {
        return this.body;
    }

}
