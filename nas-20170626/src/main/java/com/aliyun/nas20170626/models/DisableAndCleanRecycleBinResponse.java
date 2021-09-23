// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DisableAndCleanRecycleBinResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableAndCleanRecycleBinResponseBody body;

    public static DisableAndCleanRecycleBinResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableAndCleanRecycleBinResponse self = new DisableAndCleanRecycleBinResponse();
        return TeaModel.build(map, self);
    }

    public DisableAndCleanRecycleBinResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableAndCleanRecycleBinResponse setBody(DisableAndCleanRecycleBinResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableAndCleanRecycleBinResponseBody getBody() {
        return this.body;
    }

}
