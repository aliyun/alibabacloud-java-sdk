// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetHistoryFlTrainingJobInstanceByJobIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetHistoryFlTrainingJobInstanceByJobIdResponseBody body;

    public static GetHistoryFlTrainingJobInstanceByJobIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHistoryFlTrainingJobInstanceByJobIdResponse self = new GetHistoryFlTrainingJobInstanceByJobIdResponse();
        return TeaModel.build(map, self);
    }

    public GetHistoryFlTrainingJobInstanceByJobIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHistoryFlTrainingJobInstanceByJobIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHistoryFlTrainingJobInstanceByJobIdResponse setBody(GetHistoryFlTrainingJobInstanceByJobIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHistoryFlTrainingJobInstanceByJobIdResponseBody getBody() {
        return this.body;
    }

}
