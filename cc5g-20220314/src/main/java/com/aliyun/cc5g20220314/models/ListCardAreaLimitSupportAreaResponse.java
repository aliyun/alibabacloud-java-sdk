// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListCardAreaLimitSupportAreaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCardAreaLimitSupportAreaResponseBody body;

    public static ListCardAreaLimitSupportAreaResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCardAreaLimitSupportAreaResponse self = new ListCardAreaLimitSupportAreaResponse();
        return TeaModel.build(map, self);
    }

    public ListCardAreaLimitSupportAreaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCardAreaLimitSupportAreaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCardAreaLimitSupportAreaResponse setBody(ListCardAreaLimitSupportAreaResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCardAreaLimitSupportAreaResponseBody getBody() {
        return this.body;
    }

}
