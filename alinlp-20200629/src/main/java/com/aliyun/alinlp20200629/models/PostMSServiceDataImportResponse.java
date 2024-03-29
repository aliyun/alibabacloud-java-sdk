// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class PostMSServiceDataImportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PostMSServiceDataImportResponseBody body;

    public static PostMSServiceDataImportResponse build(java.util.Map<String, ?> map) throws Exception {
        PostMSServiceDataImportResponse self = new PostMSServiceDataImportResponse();
        return TeaModel.build(map, self);
    }

    public PostMSServiceDataImportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PostMSServiceDataImportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PostMSServiceDataImportResponse setBody(PostMSServiceDataImportResponseBody body) {
        this.body = body;
        return this;
    }
    public PostMSServiceDataImportResponseBody getBody() {
        return this.body;
    }

}
