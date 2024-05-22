// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class AddMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddMembersResponseBody body;

    public static AddMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMembersResponse self = new AddMembersResponse();
        return TeaModel.build(map, self);
    }

    public AddMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddMembersResponse setBody(AddMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMembersResponseBody getBody() {
        return this.body;
    }

}
