// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListTaskFlowInstanceResponseBody body;

    public static ListTaskFlowInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskFlowInstanceResponse self = new ListTaskFlowInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskFlowInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTaskFlowInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTaskFlowInstanceResponse setBody(ListTaskFlowInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTaskFlowInstanceResponseBody getBody() {
        return this.body;
    }

}
