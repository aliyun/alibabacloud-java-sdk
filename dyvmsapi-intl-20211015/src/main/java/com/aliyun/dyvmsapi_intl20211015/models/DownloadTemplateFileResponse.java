// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class DownloadTemplateFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadTemplateFileResponseBody body;

    public static DownloadTemplateFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadTemplateFileResponse self = new DownloadTemplateFileResponse();
        return TeaModel.build(map, self);
    }

    public DownloadTemplateFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadTemplateFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadTemplateFileResponse setBody(DownloadTemplateFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadTemplateFileResponseBody getBody() {
        return this.body;
    }

}
