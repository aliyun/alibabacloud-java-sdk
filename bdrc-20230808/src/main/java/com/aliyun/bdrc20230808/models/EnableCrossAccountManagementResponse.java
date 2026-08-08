// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class EnableCrossAccountManagementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableCrossAccountManagementResponseBody body;

    public static EnableCrossAccountManagementResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableCrossAccountManagementResponse self = new EnableCrossAccountManagementResponse();
        return TeaModel.build(map, self);
    }

    public EnableCrossAccountManagementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableCrossAccountManagementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableCrossAccountManagementResponse setBody(EnableCrossAccountManagementResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableCrossAccountManagementResponseBody getBody() {
        return this.body;
    }

}
