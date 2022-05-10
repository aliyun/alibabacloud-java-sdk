// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDataServiceApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDataServiceApiResponseBody body;

    public static CreateDataServiceApiResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataServiceApiResponse self = new CreateDataServiceApiResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataServiceApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataServiceApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataServiceApiResponse setBody(CreateDataServiceApiResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataServiceApiResponseBody getBody() {
        return this.body;
    }

}
