// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class AddServiceSharedAccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddServiceSharedAccountsResponseBody body;

    public static AddServiceSharedAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddServiceSharedAccountsResponse self = new AddServiceSharedAccountsResponse();
        return TeaModel.build(map, self);
    }

    public AddServiceSharedAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddServiceSharedAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddServiceSharedAccountsResponse setBody(AddServiceSharedAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddServiceSharedAccountsResponseBody getBody() {
        return this.body;
    }

}
