// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetUploadTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUploadTaskResponseBody body;

    public static GetUploadTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUploadTaskResponse self = new GetUploadTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetUploadTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUploadTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUploadTaskResponse setBody(GetUploadTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUploadTaskResponseBody getBody() {
        return this.body;
    }

}
