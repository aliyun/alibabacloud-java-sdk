// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SecurityPhysicalDeleteResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SecurityPhysicalDeleteResourceResponseBody body;

    public static SecurityPhysicalDeleteResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        SecurityPhysicalDeleteResourceResponse self = new SecurityPhysicalDeleteResourceResponse();
        return TeaModel.build(map, self);
    }

    public SecurityPhysicalDeleteResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SecurityPhysicalDeleteResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SecurityPhysicalDeleteResourceResponse setBody(SecurityPhysicalDeleteResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public SecurityPhysicalDeleteResourceResponseBody getBody() {
        return this.body;
    }

}
