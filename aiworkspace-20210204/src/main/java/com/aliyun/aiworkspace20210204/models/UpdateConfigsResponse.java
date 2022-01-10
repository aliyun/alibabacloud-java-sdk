// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateConfigsResponseBody body;

    public static UpdateConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigsResponse self = new UpdateConfigsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateConfigsResponse setBody(UpdateConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateConfigsResponseBody getBody() {
        return this.body;
    }

}
