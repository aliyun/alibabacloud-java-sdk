// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertImageToMarkdownJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitConvertImageToMarkdownJobResponseBody body;

    public static SubmitConvertImageToMarkdownJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitConvertImageToMarkdownJobResponse self = new SubmitConvertImageToMarkdownJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitConvertImageToMarkdownJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitConvertImageToMarkdownJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitConvertImageToMarkdownJobResponse setBody(SubmitConvertImageToMarkdownJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitConvertImageToMarkdownJobResponseBody getBody() {
        return this.body;
    }

}
