// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetReqAuthConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetReqAuthConfigResponseBody body;

    public static SetReqAuthConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetReqAuthConfigResponse self = new SetReqAuthConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetReqAuthConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetReqAuthConfigResponse setBody(SetReqAuthConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetReqAuthConfigResponseBody getBody() {
        return this.body;
    }

}
