// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateExternalDataServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExternalDataServiceResponseBody body;

    public static CreateExternalDataServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExternalDataServiceResponse self = new CreateExternalDataServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateExternalDataServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExternalDataServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExternalDataServiceResponse setBody(CreateExternalDataServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExternalDataServiceResponseBody getBody() {
        return this.body;
    }

}
