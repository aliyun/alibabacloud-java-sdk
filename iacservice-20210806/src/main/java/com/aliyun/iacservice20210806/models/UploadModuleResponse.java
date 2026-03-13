// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UploadModuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadModuleResponseBody body;

    public static UploadModuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadModuleResponse self = new UploadModuleResponse();
        return TeaModel.build(map, self);
    }

    public UploadModuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadModuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadModuleResponse setBody(UploadModuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadModuleResponseBody getBody() {
        return this.body;
    }

}
