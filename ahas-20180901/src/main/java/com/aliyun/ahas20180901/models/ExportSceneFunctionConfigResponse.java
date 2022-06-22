// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ExportSceneFunctionConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ExportSceneFunctionConfigResponseBody body;

    public static ExportSceneFunctionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportSceneFunctionConfigResponse self = new ExportSceneFunctionConfigResponse();
        return TeaModel.build(map, self);
    }

    public ExportSceneFunctionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportSceneFunctionConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportSceneFunctionConfigResponse setBody(ExportSceneFunctionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportSceneFunctionConfigResponseBody getBody() {
        return this.body;
    }

}
