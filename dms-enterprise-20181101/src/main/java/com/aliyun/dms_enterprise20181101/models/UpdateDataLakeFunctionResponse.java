// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateDataLakeFunctionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataLakeFunctionResponseBody body;

    public static UpdateDataLakeFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataLakeFunctionResponse self = new UpdateDataLakeFunctionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataLakeFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataLakeFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataLakeFunctionResponse setBody(UpdateDataLakeFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataLakeFunctionResponseBody getBody() {
        return this.body;
    }

}
