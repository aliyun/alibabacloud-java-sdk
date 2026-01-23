// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateStandardTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateStandardTemplateResponseBody body;

    public static UpdateStandardTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStandardTemplateResponse self = new UpdateStandardTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStandardTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStandardTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateStandardTemplateResponse setBody(UpdateStandardTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStandardTemplateResponseBody getBody() {
        return this.body;
    }

}
