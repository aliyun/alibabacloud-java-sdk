// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ApproveProcessInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApproveProcessInstanceResponseBody body;

    public static ApproveProcessInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ApproveProcessInstanceResponse self = new ApproveProcessInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ApproveProcessInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApproveProcessInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApproveProcessInstanceResponse setBody(ApproveProcessInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ApproveProcessInstanceResponseBody getBody() {
        return this.body;
    }

}
