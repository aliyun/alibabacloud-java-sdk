// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDIJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDIJobResponseBody body;

    public static GetDIJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDIJobResponse self = new GetDIJobResponse();
        return TeaModel.build(map, self);
    }

    public GetDIJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDIJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDIJobResponse setBody(GetDIJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDIJobResponseBody getBody() {
        return this.body;
    }

}
