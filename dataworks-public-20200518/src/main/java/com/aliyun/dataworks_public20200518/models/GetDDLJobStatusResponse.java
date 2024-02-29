// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDDLJobStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDDLJobStatusResponseBody body;

    public static GetDDLJobStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDDLJobStatusResponse self = new GetDDLJobStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetDDLJobStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDDLJobStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDDLJobStatusResponse setBody(GetDDLJobStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDDLJobStatusResponseBody getBody() {
        return this.body;
    }

}
