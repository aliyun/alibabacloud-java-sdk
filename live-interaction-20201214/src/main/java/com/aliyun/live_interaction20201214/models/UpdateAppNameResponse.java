// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class UpdateAppNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAppNameResponseBody body;

    public static UpdateAppNameResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppNameResponse self = new UpdateAppNameResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAppNameResponse setBody(UpdateAppNameResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppNameResponseBody getBody() {
        return this.body;
    }

}
