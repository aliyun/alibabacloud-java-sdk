// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class UpdateApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateApiResponseBody body;

    public static UpdateApiResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiResponse self = new UpdateApiResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApiResponse setBody(UpdateApiResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApiResponseBody getBody() {
        return this.body;
    }

}
