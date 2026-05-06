// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UpdateModelTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateModelTemplateResponseBody body;

    public static UpdateModelTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelTemplateResponse self = new UpdateModelTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateModelTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateModelTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateModelTemplateResponse setBody(UpdateModelTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateModelTemplateResponseBody getBody() {
        return this.body;
    }

}
