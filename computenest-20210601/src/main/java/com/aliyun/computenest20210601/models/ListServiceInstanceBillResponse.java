// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListServiceInstanceBillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServiceInstanceBillResponseBody body;

    public static ListServiceInstanceBillResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstanceBillResponse self = new ListServiceInstanceBillResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceInstanceBillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceInstanceBillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceInstanceBillResponse setBody(ListServiceInstanceBillResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceInstanceBillResponseBody getBody() {
        return this.body;
    }

}
