// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class OperateInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateInstanceResponseBody body;

    public static OperateInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateInstanceResponse self = new OperateInstanceResponse();
        return TeaModel.build(map, self);
    }

    public OperateInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateInstanceResponse setBody(OperateInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateInstanceResponseBody getBody() {
        return this.body;
    }

}
