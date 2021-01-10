// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateSchemaSubscribeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSchemaSubscribeResponseBody body;

    public static UpdateSchemaSubscribeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSchemaSubscribeResponse self = new UpdateSchemaSubscribeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSchemaSubscribeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSchemaSubscribeResponse setBody(UpdateSchemaSubscribeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSchemaSubscribeResponseBody getBody() {
        return this.body;
    }

}
