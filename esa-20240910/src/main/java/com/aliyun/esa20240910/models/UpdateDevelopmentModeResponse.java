// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateDevelopmentModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDevelopmentModeResponseBody body;

    public static UpdateDevelopmentModeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDevelopmentModeResponse self = new UpdateDevelopmentModeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDevelopmentModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDevelopmentModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDevelopmentModeResponse setBody(UpdateDevelopmentModeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDevelopmentModeResponseBody getBody() {
        return this.body;
    }

}
