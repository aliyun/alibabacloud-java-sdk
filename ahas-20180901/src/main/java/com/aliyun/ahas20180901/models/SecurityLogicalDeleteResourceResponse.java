// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SecurityLogicalDeleteResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SecurityLogicalDeleteResourceResponseBody body;

    public static SecurityLogicalDeleteResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        SecurityLogicalDeleteResourceResponse self = new SecurityLogicalDeleteResourceResponse();
        return TeaModel.build(map, self);
    }

    public SecurityLogicalDeleteResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SecurityLogicalDeleteResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SecurityLogicalDeleteResourceResponse setBody(SecurityLogicalDeleteResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public SecurityLogicalDeleteResourceResponseBody getBody() {
        return this.body;
    }

}
