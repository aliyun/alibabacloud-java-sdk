// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateConnectionPoolAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateConnectionPoolAttributeResponseBody body;

    public static UpdateConnectionPoolAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnectionPoolAttributeResponse self = new UpdateConnectionPoolAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateConnectionPoolAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateConnectionPoolAttributeResponse setBody(UpdateConnectionPoolAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateConnectionPoolAttributeResponseBody getBody() {
        return this.body;
    }

}
