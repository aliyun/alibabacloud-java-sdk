// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListRdsDBInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRdsDBInstancesResponseBody body;

    public static ListRdsDBInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRdsDBInstancesResponse self = new ListRdsDBInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListRdsDBInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRdsDBInstancesResponse setBody(ListRdsDBInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRdsDBInstancesResponseBody getBody() {
        return this.body;
    }

}
