// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class UpdateBizChainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateBizChainResponseBody body;

    public static UpdateBizChainResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBizChainResponse self = new UpdateBizChainResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBizChainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBizChainResponse setBody(UpdateBizChainResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBizChainResponseBody getBody() {
        return this.body;
    }

}
