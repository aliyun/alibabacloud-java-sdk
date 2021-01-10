// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateAppBlackWhiteVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAppBlackWhiteVersionsResponseBody body;

    public static UpdateAppBlackWhiteVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppBlackWhiteVersionsResponse self = new UpdateAppBlackWhiteVersionsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppBlackWhiteVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppBlackWhiteVersionsResponse setBody(UpdateAppBlackWhiteVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppBlackWhiteVersionsResponseBody getBody() {
        return this.body;
    }

}
