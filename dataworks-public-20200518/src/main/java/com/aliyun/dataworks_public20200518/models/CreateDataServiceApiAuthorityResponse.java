// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDataServiceApiAuthorityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataServiceApiAuthorityResponseBody body;

    public static CreateDataServiceApiAuthorityResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataServiceApiAuthorityResponse self = new CreateDataServiceApiAuthorityResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataServiceApiAuthorityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataServiceApiAuthorityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataServiceApiAuthorityResponse setBody(CreateDataServiceApiAuthorityResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataServiceApiAuthorityResponseBody getBody() {
        return this.body;
    }

}
