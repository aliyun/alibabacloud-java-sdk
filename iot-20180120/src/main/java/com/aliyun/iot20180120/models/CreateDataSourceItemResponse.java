// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDataSourceItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataSourceItemResponseBody body;

    public static CreateDataSourceItemResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataSourceItemResponse self = new CreateDataSourceItemResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataSourceItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataSourceItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataSourceItemResponse setBody(CreateDataSourceItemResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataSourceItemResponseBody getBody() {
        return this.body;
    }

}
