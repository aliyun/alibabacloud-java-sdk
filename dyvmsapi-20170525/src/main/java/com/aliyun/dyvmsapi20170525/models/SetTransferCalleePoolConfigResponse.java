// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SetTransferCalleePoolConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetTransferCalleePoolConfigResponseBody body;

    public static SetTransferCalleePoolConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetTransferCalleePoolConfigResponse self = new SetTransferCalleePoolConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetTransferCalleePoolConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetTransferCalleePoolConfigResponse setBody(SetTransferCalleePoolConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetTransferCalleePoolConfigResponseBody getBody() {
        return this.body;
    }

}
