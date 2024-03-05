// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetJobLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetJobLogResponseBody body;

    public static GetJobLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobLogResponse self = new GetJobLogResponse();
        return TeaModel.build(map, self);
    }

    public GetJobLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJobLogResponse setBody(GetJobLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobLogResponseBody getBody() {
        return this.body;
    }

}
