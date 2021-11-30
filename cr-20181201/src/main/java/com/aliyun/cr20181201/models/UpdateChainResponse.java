// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateChainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateChainResponseBody body;

    public static UpdateChainResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateChainResponse self = new UpdateChainResponse();
        return TeaModel.build(map, self);
    }

    public UpdateChainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateChainResponse setBody(UpdateChainResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateChainResponseBody getBody() {
        return this.body;
    }

}
