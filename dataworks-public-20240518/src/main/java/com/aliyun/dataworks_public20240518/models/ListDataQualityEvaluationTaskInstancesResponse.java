// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityEvaluationTaskInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataQualityEvaluationTaskInstancesResponseBody body;

    public static ListDataQualityEvaluationTaskInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityEvaluationTaskInstancesResponse self = new ListDataQualityEvaluationTaskInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListDataQualityEvaluationTaskInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataQualityEvaluationTaskInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataQualityEvaluationTaskInstancesResponse setBody(ListDataQualityEvaluationTaskInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataQualityEvaluationTaskInstancesResponseBody getBody() {
        return this.body;
    }

}
