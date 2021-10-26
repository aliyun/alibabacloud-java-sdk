// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteLogConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLogConfigResponseBody body;

    public static DeleteLogConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogConfigResponse self = new DeleteLogConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLogConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLogConfigResponse setBody(DeleteLogConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLogConfigResponseBody getBody() {
        return this.body;
    }

}
