// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class UpdateSparkTemplateFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSparkTemplateFileResponseBody body;

    public static UpdateSparkTemplateFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSparkTemplateFileResponse self = new UpdateSparkTemplateFileResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSparkTemplateFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSparkTemplateFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSparkTemplateFileResponse setBody(UpdateSparkTemplateFileResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSparkTemplateFileResponseBody getBody() {
        return this.body;
    }

}
