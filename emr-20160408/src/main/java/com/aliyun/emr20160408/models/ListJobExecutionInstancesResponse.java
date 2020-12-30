// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListJobExecutionInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListJobExecutionInstancesResponseBody body;

    public static ListJobExecutionInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobExecutionInstancesResponse self = new ListJobExecutionInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListJobExecutionInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJobExecutionInstancesResponse setBody(ListJobExecutionInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobExecutionInstancesResponseBody getBody() {
        return this.body;
    }

}
