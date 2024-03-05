// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.customerservice20231228.models;

import com.aliyun.tea.*;

public class ListServiceApplyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServiceApplyResponseBody body;

    public static ListServiceApplyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceApplyResponse self = new ListServiceApplyResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceApplyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceApplyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceApplyResponse setBody(ListServiceApplyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceApplyResponseBody getBody() {
        return this.body;
    }

}
