// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSiteFunctionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSiteFunctionResponseBody body;

    public static UpdateSiteFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSiteFunctionResponse self = new UpdateSiteFunctionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSiteFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSiteFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSiteFunctionResponse setBody(UpdateSiteFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSiteFunctionResponseBody getBody() {
        return this.body;
    }

}
