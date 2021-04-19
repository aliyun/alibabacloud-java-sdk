// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckScaleOutBalancedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CheckScaleOutBalancedResponse setBody(CheckScaleOutBalancedResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckScaleOutBalancedResponseBody getBody() {
        return this.body;
    }

}
