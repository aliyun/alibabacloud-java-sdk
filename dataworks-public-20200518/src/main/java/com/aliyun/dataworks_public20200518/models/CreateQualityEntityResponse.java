// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateQualityEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateQualityEntityResponseBody body;

    public static CreateQualityEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateQualityEntityResponse self = new CreateQualityEntityResponse();
        return TeaModel.build(map, self);
    }

    public CreateQualityEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateQualityEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateQualityEntityResponse setBody(CreateQualityEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateQualityEntityResponseBody getBody() {
        return this.body;
    }

}
