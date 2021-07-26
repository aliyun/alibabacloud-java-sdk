// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteIpBlockResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteIpBlockResponseBody body;

    public static DeleteIpBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpBlockResponse self = new DeleteIpBlockResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIpBlockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIpBlockResponse setBody(DeleteIpBlockResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIpBlockResponseBody getBody() {
        return this.body;
    }

}
