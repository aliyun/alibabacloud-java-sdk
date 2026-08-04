// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class FindAllContacterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FindAllContacterResponseBody body;

    public static FindAllContacterResponse build(java.util.Map<String, ?> map) throws Exception {
        FindAllContacterResponse self = new FindAllContacterResponse();
        return TeaModel.build(map, self);
    }

    public FindAllContacterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindAllContacterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FindAllContacterResponse setBody(FindAllContacterResponseBody body) {
        this.body = body;
        return this;
    }
    public FindAllContacterResponseBody getBody() {
        return this.body;
    }

}
