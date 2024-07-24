// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CheckAlibabaStaffResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckAlibabaStaffResponseBody body;

    public static CheckAlibabaStaffResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAlibabaStaffResponse self = new CheckAlibabaStaffResponse();
        return TeaModel.build(map, self);
    }

    public CheckAlibabaStaffResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckAlibabaStaffResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckAlibabaStaffResponse setBody(CheckAlibabaStaffResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckAlibabaStaffResponseBody getBody() {
        return this.body;
    }

}
