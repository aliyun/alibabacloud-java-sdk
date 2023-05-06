// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListAppVersionAdaptorsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAppVersionAdaptorsResponseBody body;

    public static ListAppVersionAdaptorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppVersionAdaptorsResponse self = new ListAppVersionAdaptorsResponse();
        return TeaModel.build(map, self);
    }

    public ListAppVersionAdaptorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppVersionAdaptorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppVersionAdaptorsResponse setBody(ListAppVersionAdaptorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppVersionAdaptorsResponseBody getBody() {
        return this.body;
    }

}
