// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SetSuccessInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetSuccessInstanceResponseBody body;

    public static SetSuccessInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        SetSuccessInstanceResponse self = new SetSuccessInstanceResponse();
        return TeaModel.build(map, self);
    }

    public SetSuccessInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetSuccessInstanceResponse setBody(SetSuccessInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public SetSuccessInstanceResponseBody getBody() {
        return this.body;
    }

}
