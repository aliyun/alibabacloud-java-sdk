// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetReqHeaderConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetReqHeaderConfigResponseBody body;

    public static SetReqHeaderConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetReqHeaderConfigResponse self = new SetReqHeaderConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetReqHeaderConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetReqHeaderConfigResponse setBody(SetReqHeaderConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetReqHeaderConfigResponseBody getBody() {
        return this.body;
    }

}
