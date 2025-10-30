// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class AddRegisterLineageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddRegisterLineageResponseBody body;

    public static AddRegisterLineageResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRegisterLineageResponse self = new AddRegisterLineageResponse();
        return TeaModel.build(map, self);
    }

    public AddRegisterLineageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRegisterLineageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddRegisterLineageResponse setBody(AddRegisterLineageResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRegisterLineageResponseBody getBody() {
        return this.body;
    }

}
