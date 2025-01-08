// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class OperateAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateAppResponseBody body;

    public static OperateAppResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateAppResponse self = new OperateAppResponse();
        return TeaModel.build(map, self);
    }

    public OperateAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateAppResponse setBody(OperateAppResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateAppResponseBody getBody() {
        return this.body;
    }

}
