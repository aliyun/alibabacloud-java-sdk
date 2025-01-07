// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class DeleteAutoScalingConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAutoScalingConfigResponseBody body;

    public static DeleteAutoScalingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoScalingConfigResponse self = new DeleteAutoScalingConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAutoScalingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAutoScalingConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAutoScalingConfigResponse setBody(DeleteAutoScalingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAutoScalingConfigResponseBody getBody() {
        return this.body;
    }

}
