// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddGrafanaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddGrafanaResponseBody body;

    public static AddGrafanaResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGrafanaResponse self = new AddGrafanaResponse();
        return TeaModel.build(map, self);
    }

    public AddGrafanaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddGrafanaResponse setBody(AddGrafanaResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGrafanaResponseBody getBody() {
        return this.body;
    }

}
