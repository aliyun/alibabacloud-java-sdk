// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckScaleOutBalancedResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckScaleOutBalancedResponseBody body;

    public static CheckScaleOutBalancedResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckScaleOutBalancedResponse self = new CheckScaleOutBalancedResponse();
        return TeaModel.build(map, self);
    }

    public CheckScaleOutBalancedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckScaleOutBalancedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckScaleOutBalancedResponse setBody(CheckScaleOutBalancedResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckScaleOutBalancedResponseBody getBody() {
        return this.body;
    }

}
