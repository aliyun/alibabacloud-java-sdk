// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateDataServiceApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
