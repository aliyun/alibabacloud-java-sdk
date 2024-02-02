// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateOTAModuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateOTAModuleResponseBody body;

    public static UpdateOTAModuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOTAModuleResponse self = new UpdateOTAModuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOTAModuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOTAModuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOTAModuleResponse setBody(UpdateOTAModuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOTAModuleResponseBody getBody() {
        return this.body;
    }

}
