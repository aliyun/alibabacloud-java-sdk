// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataLakeFunctionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataLakeFunctionResponseBody body;

    public static CreateDataLakeFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataLakeFunctionResponse self = new CreateDataLakeFunctionResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataLakeFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataLakeFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataLakeFunctionResponse setBody(CreateDataLakeFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataLakeFunctionResponseBody getBody() {
        return this.body;
    }

}
