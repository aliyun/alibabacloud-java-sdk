// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetQueueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetQueueResponseBody body;

    public static SetQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        SetQueueResponse self = new SetQueueResponse();
        return TeaModel.build(map, self);
    }

    public SetQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetQueueResponse setBody(SetQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public SetQueueResponseBody getBody() {
        return this.body;
    }

}
