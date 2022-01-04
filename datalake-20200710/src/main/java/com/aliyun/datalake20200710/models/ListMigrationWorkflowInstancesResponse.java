// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListMigrationWorkflowInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMigrationWorkflowInstancesResponseBody body;

    public static ListMigrationWorkflowInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMigrationWorkflowInstancesResponse self = new ListMigrationWorkflowInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListMigrationWorkflowInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMigrationWorkflowInstancesResponse setBody(ListMigrationWorkflowInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMigrationWorkflowInstancesResponseBody getBody() {
        return this.body;
    }

}
