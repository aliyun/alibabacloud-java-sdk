// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateProblemEffectionServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProblemEffectionServiceResponseBody body;

    public static UpdateProblemEffectionServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProblemEffectionServiceResponse self = new UpdateProblemEffectionServiceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProblemEffectionServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProblemEffectionServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProblemEffectionServiceResponse setBody(UpdateProblemEffectionServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProblemEffectionServiceResponseBody getBody() {
        return this.body;
    }

}
