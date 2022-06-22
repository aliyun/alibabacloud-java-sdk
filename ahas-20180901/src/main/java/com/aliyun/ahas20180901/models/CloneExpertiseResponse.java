// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CloneExpertiseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CloneExpertiseResponseBody body;

    public static CloneExpertiseResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneExpertiseResponse self = new CloneExpertiseResponse();
        return TeaModel.build(map, self);
    }

    public CloneExpertiseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneExpertiseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloneExpertiseResponse setBody(CloneExpertiseResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneExpertiseResponseBody getBody() {
        return this.body;
    }

}
