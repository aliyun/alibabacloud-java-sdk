// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.commondriver20160712.models;

import com.aliyun.tea.*;

public class UpdateHostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHostResponseBody body;

    public static UpdateHostResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHostResponse self = new UpdateHostResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHostResponse setBody(UpdateHostResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHostResponseBody getBody() {
        return this.body;
    }

}
