// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDIJobLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDIJobLogResponseBody body;

    public static GetDIJobLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDIJobLogResponse self = new GetDIJobLogResponse();
        return TeaModel.build(map, self);
    }

    public GetDIJobLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDIJobLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDIJobLogResponse setBody(GetDIJobLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDIJobLogResponseBody getBody() {
        return this.body;
    }

}
