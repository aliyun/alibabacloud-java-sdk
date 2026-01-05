// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class FileUploadCallbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FileUploadCallbackResponseBody body;

    public static FileUploadCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        FileUploadCallbackResponse self = new FileUploadCallbackResponse();
        return TeaModel.build(map, self);
    }

    public FileUploadCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FileUploadCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FileUploadCallbackResponse setBody(FileUploadCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public FileUploadCallbackResponseBody getBody() {
        return this.body;
    }

}
