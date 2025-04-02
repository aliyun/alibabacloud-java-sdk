// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetSymbolicFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSymbolicFilesResponseBody body;

    public static GetSymbolicFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSymbolicFilesResponse self = new GetSymbolicFilesResponse();
        return TeaModel.build(map, self);
    }

    public GetSymbolicFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSymbolicFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSymbolicFilesResponse setBody(GetSymbolicFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSymbolicFilesResponseBody getBody() {
        return this.body;
    }

}
