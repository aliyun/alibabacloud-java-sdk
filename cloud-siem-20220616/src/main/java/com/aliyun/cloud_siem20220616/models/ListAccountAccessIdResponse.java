// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListAccountAccessIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAccountAccessIdResponseBody body;

    public static ListAccountAccessIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccountAccessIdResponse self = new ListAccountAccessIdResponse();
        return TeaModel.build(map, self);
    }

    public ListAccountAccessIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccountAccessIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAccountAccessIdResponse setBody(ListAccountAccessIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccountAccessIdResponseBody getBody() {
        return this.body;
    }

}
