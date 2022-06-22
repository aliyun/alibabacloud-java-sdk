// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetApplicationExperimentTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetApplicationExperimentTasksResponseBody body;

    public static GetApplicationExperimentTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationExperimentTasksResponse self = new GetApplicationExperimentTasksResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationExperimentTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApplicationExperimentTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApplicationExperimentTasksResponse setBody(GetApplicationExperimentTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApplicationExperimentTasksResponseBody getBody() {
        return this.body;
    }

}
