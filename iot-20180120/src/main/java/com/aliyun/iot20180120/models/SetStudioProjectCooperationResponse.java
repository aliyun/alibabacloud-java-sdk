// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetStudioProjectCooperationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetStudioProjectCooperationResponseBody body;

    public static SetStudioProjectCooperationResponse build(java.util.Map<String, ?> map) throws Exception {
        SetStudioProjectCooperationResponse self = new SetStudioProjectCooperationResponse();
        return TeaModel.build(map, self);
    }

    public SetStudioProjectCooperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetStudioProjectCooperationResponse setBody(SetStudioProjectCooperationResponseBody body) {
        this.body = body;
        return this;
    }
    public SetStudioProjectCooperationResponseBody getBody() {
        return this.body;
    }

}
