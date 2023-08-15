// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ListHBaseInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListHBaseInstancesResponseBody body;

    public static ListHBaseInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHBaseInstancesResponse self = new ListHBaseInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListHBaseInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHBaseInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHBaseInstancesResponse setBody(ListHBaseInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHBaseInstancesResponseBody getBody() {
        return this.body;
    }

}
