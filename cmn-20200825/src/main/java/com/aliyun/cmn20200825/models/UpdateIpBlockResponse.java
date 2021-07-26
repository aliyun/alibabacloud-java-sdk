// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateIpBlockResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateIpBlockResponseBody body;

    public static UpdateIpBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpBlockResponse self = new UpdateIpBlockResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIpBlockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIpBlockResponse setBody(UpdateIpBlockResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIpBlockResponseBody getBody() {
        return this.body;
    }

}
