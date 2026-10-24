// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class OperateTargetConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateTargetConfigResponseBody body;

    public static OperateTargetConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateTargetConfigResponse self = new OperateTargetConfigResponse();
        return TeaModel.build(map, self);
    }

    public OperateTargetConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateTargetConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateTargetConfigResponse setBody(OperateTargetConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateTargetConfigResponseBody getBody() {
        return this.body;
    }

}
