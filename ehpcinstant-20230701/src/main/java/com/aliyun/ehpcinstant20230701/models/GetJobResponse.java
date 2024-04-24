// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class GetJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetJobResponseBody body;

    public static GetJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobResponse self = new GetJobResponse();
        return TeaModel.build(map, self);
    }

    public GetJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJobResponse setBody(GetJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobResponseBody getBody() {
        return this.body;
    }

}
