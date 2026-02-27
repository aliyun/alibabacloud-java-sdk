// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateDataServiceAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataServiceAppResponseBody body;

    public static CreateDataServiceAppResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataServiceAppResponse self = new CreateDataServiceAppResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataServiceAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataServiceAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataServiceAppResponse setBody(CreateDataServiceAppResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataServiceAppResponseBody getBody() {
        return this.body;
    }

}
