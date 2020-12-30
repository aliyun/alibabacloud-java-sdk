// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListExecutionPlanInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListExecutionPlanInstancesResponseBody body;

    public static ListExecutionPlanInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExecutionPlanInstancesResponse self = new ListExecutionPlanInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListExecutionPlanInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExecutionPlanInstancesResponse setBody(ListExecutionPlanInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExecutionPlanInstancesResponseBody getBody() {
        return this.body;
    }

}
