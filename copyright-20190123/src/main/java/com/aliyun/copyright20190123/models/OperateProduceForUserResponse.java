// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class OperateProduceForUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OperateProduceForUserResponseBody body;

    public static OperateProduceForUserResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateProduceForUserResponse self = new OperateProduceForUserResponse();
        return TeaModel.build(map, self);
    }

    public OperateProduceForUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateProduceForUserResponse setBody(OperateProduceForUserResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateProduceForUserResponseBody getBody() {
        return this.body;
    }

}
