// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class AddUserDefinedSgResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddUserDefinedSgResponseBody body;

    public static AddUserDefinedSgResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUserDefinedSgResponse self = new AddUserDefinedSgResponse();
        return TeaModel.build(map, self);
    }

    public AddUserDefinedSgResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUserDefinedSgResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddUserDefinedSgResponse setBody(AddUserDefinedSgResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUserDefinedSgResponseBody getBody() {
        return this.body;
    }

}
