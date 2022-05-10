// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateAppTemplateConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAppTemplateConfigResponseBody body;

    public static UpdateAppTemplateConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppTemplateConfigResponse self = new UpdateAppTemplateConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppTemplateConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppTemplateConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAppTemplateConfigResponse setBody(UpdateAppTemplateConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppTemplateConfigResponseBody getBody() {
        return this.body;
    }

}
