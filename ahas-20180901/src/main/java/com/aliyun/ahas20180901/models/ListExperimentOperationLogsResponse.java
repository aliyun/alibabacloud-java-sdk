// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListExperimentOperationLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListExperimentOperationLogsResponseBody body;

    public static ListExperimentOperationLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentOperationLogsResponse self = new ListExperimentOperationLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListExperimentOperationLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExperimentOperationLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExperimentOperationLogsResponse setBody(ListExperimentOperationLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExperimentOperationLogsResponseBody getBody() {
        return this.body;
    }

}
