// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityEvaluationTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataQualityEvaluationTasksResponseBody body;

    public static ListDataQualityEvaluationTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityEvaluationTasksResponse self = new ListDataQualityEvaluationTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListDataQualityEvaluationTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataQualityEvaluationTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataQualityEvaluationTasksResponse setBody(ListDataQualityEvaluationTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataQualityEvaluationTasksResponseBody getBody() {
        return this.body;
    }

}
