// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateTableLevelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTableLevelResponseBody body;

    public static CreateTableLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTableLevelResponse self = new CreateTableLevelResponse();
        return TeaModel.build(map, self);
    }

    public CreateTableLevelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTableLevelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTableLevelResponse setBody(CreateTableLevelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTableLevelResponseBody getBody() {
        return this.body;
    }

}
