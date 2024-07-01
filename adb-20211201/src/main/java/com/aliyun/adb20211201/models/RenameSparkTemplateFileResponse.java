// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class RenameSparkTemplateFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenameSparkTemplateFileResponseBody body;

    public static RenameSparkTemplateFileResponse build(java.util.Map<String, ?> map) throws Exception {
        RenameSparkTemplateFileResponse self = new RenameSparkTemplateFileResponse();
        return TeaModel.build(map, self);
    }

    public RenameSparkTemplateFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenameSparkTemplateFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenameSparkTemplateFileResponse setBody(RenameSparkTemplateFileResponseBody body) {
        this.body = body;
        return this;
    }
    public RenameSparkTemplateFileResponseBody getBody() {
        return this.body;
    }

}
