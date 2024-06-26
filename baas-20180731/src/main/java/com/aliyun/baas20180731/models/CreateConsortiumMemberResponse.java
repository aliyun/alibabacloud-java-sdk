// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateConsortiumMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateConsortiumMemberResponseBody body;

    public static CreateConsortiumMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConsortiumMemberResponse self = new CreateConsortiumMemberResponse();
        return TeaModel.build(map, self);
    }

    public CreateConsortiumMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConsortiumMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateConsortiumMemberResponse setBody(CreateConsortiumMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConsortiumMemberResponseBody getBody() {
        return this.body;
    }

}
