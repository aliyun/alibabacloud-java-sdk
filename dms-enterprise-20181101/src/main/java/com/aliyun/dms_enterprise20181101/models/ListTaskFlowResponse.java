// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTaskFlowResponseBody body;

    public static ListTaskFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskFlowResponse self = new ListTaskFlowResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTaskFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTaskFlowResponse setBody(ListTaskFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTaskFlowResponseBody getBody() {
        return this.body;
    }

}
