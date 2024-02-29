// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateQualityRelativeNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateQualityRelativeNodeResponseBody body;

    public static CreateQualityRelativeNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateQualityRelativeNodeResponse self = new CreateQualityRelativeNodeResponse();
        return TeaModel.build(map, self);
    }

    public CreateQualityRelativeNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateQualityRelativeNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateQualityRelativeNodeResponse setBody(CreateQualityRelativeNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateQualityRelativeNodeResponseBody getBody() {
        return this.body;
    }

}
