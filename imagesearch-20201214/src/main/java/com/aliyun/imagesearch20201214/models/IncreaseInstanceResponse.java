// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class IncreaseInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public IncreaseInstanceResponseBody body;

    public static IncreaseInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        IncreaseInstanceResponse self = new IncreaseInstanceResponse();
        return TeaModel.build(map, self);
    }

    public IncreaseInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IncreaseInstanceResponse setBody(IncreaseInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public IncreaseInstanceResponseBody getBody() {
        return this.body;
    }

}
