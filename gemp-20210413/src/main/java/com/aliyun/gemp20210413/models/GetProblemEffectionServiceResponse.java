// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetProblemEffectionServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProblemEffectionServiceResponseBody body;

    public static GetProblemEffectionServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProblemEffectionServiceResponse self = new GetProblemEffectionServiceResponse();
        return TeaModel.build(map, self);
    }

    public GetProblemEffectionServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProblemEffectionServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProblemEffectionServiceResponse setBody(GetProblemEffectionServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProblemEffectionServiceResponseBody getBody() {
        return this.body;
    }

}
