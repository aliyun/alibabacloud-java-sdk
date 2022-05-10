// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CustomGetCdnModelPathResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CustomGetCdnModelPathResponseBody body;

    public static CustomGetCdnModelPathResponse build(java.util.Map<String, ?> map) throws Exception {
        CustomGetCdnModelPathResponse self = new CustomGetCdnModelPathResponse();
        return TeaModel.build(map, self);
    }

    public CustomGetCdnModelPathResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CustomGetCdnModelPathResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CustomGetCdnModelPathResponse setBody(CustomGetCdnModelPathResponseBody body) {
        this.body = body;
        return this;
    }
    public CustomGetCdnModelPathResponseBody getBody() {
        return this.body;
    }

}
