// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class EnableExpertiseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableExpertiseResponseBody body;

    public static EnableExpertiseResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableExpertiseResponse self = new EnableExpertiseResponse();
        return TeaModel.build(map, self);
    }

    public EnableExpertiseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableExpertiseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableExpertiseResponse setBody(EnableExpertiseResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableExpertiseResponseBody getBody() {
        return this.body;
    }

}
