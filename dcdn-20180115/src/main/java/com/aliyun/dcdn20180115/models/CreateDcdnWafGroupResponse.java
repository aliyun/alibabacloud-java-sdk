// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnWafGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDcdnWafGroupResponseBody body;

    public static CreateDcdnWafGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDcdnWafGroupResponse self = new CreateDcdnWafGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateDcdnWafGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDcdnWafGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDcdnWafGroupResponse setBody(CreateDcdnWafGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDcdnWafGroupResponseBody getBody() {
        return this.body;
    }

}
