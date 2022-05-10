// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateDIProjectConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDIProjectConfigResponseBody body;

    public static UpdateDIProjectConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDIProjectConfigResponse self = new UpdateDIProjectConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDIProjectConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDIProjectConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDIProjectConfigResponse setBody(UpdateDIProjectConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDIProjectConfigResponseBody getBody() {
        return this.body;
    }

}
