// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class SaveMnsServeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveMnsServeResponseBody body;

    public static SaveMnsServeResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveMnsServeResponse self = new SaveMnsServeResponse();
        return TeaModel.build(map, self);
    }

    public SaveMnsServeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveMnsServeResponse setBody(SaveMnsServeResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveMnsServeResponseBody getBody() {
        return this.body;
    }

}
