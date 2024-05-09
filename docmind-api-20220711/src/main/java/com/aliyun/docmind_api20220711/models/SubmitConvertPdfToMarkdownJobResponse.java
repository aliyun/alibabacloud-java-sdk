// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertPdfToMarkdownJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitConvertPdfToMarkdownJobResponseBody body;

    public static SubmitConvertPdfToMarkdownJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitConvertPdfToMarkdownJobResponse self = new SubmitConvertPdfToMarkdownJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitConvertPdfToMarkdownJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitConvertPdfToMarkdownJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitConvertPdfToMarkdownJobResponse setBody(SubmitConvertPdfToMarkdownJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitConvertPdfToMarkdownJobResponseBody getBody() {
        return this.body;
    }

}
