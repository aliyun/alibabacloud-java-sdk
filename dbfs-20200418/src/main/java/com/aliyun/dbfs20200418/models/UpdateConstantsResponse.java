// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class UpdateConstantsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateConstantsResponseBody body;

    public static UpdateConstantsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConstantsResponse self = new UpdateConstantsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateConstantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateConstantsResponse setBody(UpdateConstantsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateConstantsResponseBody getBody() {
        return this.body;
    }

}
