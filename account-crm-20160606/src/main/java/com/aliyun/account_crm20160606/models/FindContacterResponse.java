// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class FindContacterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FindContacterResponseBody body;

    public static FindContacterResponse build(java.util.Map<String, ?> map) throws Exception {
        FindContacterResponse self = new FindContacterResponse();
        return TeaModel.build(map, self);
    }

    public FindContacterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindContacterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FindContacterResponse setBody(FindContacterResponseBody body) {
        this.body = body;
        return this;
    }
    public FindContacterResponseBody getBody() {
        return this.body;
    }

}
