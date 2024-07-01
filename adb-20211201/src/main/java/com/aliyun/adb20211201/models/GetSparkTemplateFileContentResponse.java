// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkTemplateFileContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSparkTemplateFileContentResponseBody body;

    public static GetSparkTemplateFileContentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSparkTemplateFileContentResponse self = new GetSparkTemplateFileContentResponse();
        return TeaModel.build(map, self);
    }

    public GetSparkTemplateFileContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSparkTemplateFileContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSparkTemplateFileContentResponse setBody(GetSparkTemplateFileContentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSparkTemplateFileContentResponseBody getBody() {
        return this.body;
    }

}
