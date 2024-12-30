// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataLakeTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataLakeTableResponseBody body;

    public static CreateDataLakeTableResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataLakeTableResponse self = new CreateDataLakeTableResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataLakeTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataLakeTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataLakeTableResponse setBody(CreateDataLakeTableResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataLakeTableResponseBody getBody() {
        return this.body;
    }

}
