// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CustomFindOrderStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CustomFindOrderStatusResponseBody body;

    public static CustomFindOrderStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CustomFindOrderStatusResponse self = new CustomFindOrderStatusResponse();
        return TeaModel.build(map, self);
    }

    public CustomFindOrderStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CustomFindOrderStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CustomFindOrderStatusResponse setBody(CustomFindOrderStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CustomFindOrderStatusResponseBody getBody() {
        return this.body;
    }

}
