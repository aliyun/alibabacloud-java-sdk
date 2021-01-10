// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateOsBlackWhiteVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateOsBlackWhiteVersionsResponseBody body;

    public static UpdateOsBlackWhiteVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOsBlackWhiteVersionsResponse self = new UpdateOsBlackWhiteVersionsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOsBlackWhiteVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOsBlackWhiteVersionsResponse setBody(UpdateOsBlackWhiteVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOsBlackWhiteVersionsResponseBody getBody() {
        return this.body;
    }

}
