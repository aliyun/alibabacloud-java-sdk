// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class AddRdMemberListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddRdMemberListResponseBody body;

    public static AddRdMemberListResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRdMemberListResponse self = new AddRdMemberListResponse();
        return TeaModel.build(map, self);
    }

    public AddRdMemberListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRdMemberListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddRdMemberListResponse setBody(AddRdMemberListResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRdMemberListResponseBody getBody() {
        return this.body;
    }

}
