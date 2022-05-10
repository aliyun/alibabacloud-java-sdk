// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimProjectDrawFilesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetBimProjectDrawFilesResponseBody body;

    public static GetBimProjectDrawFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBimProjectDrawFilesResponse self = new GetBimProjectDrawFilesResponse();
        return TeaModel.build(map, self);
    }

    public GetBimProjectDrawFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBimProjectDrawFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBimProjectDrawFilesResponse setBody(GetBimProjectDrawFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBimProjectDrawFilesResponseBody getBody() {
        return this.body;
    }

}
