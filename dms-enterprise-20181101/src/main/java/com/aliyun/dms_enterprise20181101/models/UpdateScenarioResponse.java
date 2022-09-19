// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateScenarioResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateScenarioResponseBody body;

    public static UpdateScenarioResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateScenarioResponse self = new UpdateScenarioResponse();
        return TeaModel.build(map, self);
    }

    public UpdateScenarioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateScenarioResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateScenarioResponse setBody(UpdateScenarioResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateScenarioResponseBody getBody() {
        return this.body;
    }

}
