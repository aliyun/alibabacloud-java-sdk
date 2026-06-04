// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateMetaEntityDefResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMetaEntityDefResponseBody body;

    public static CreateMetaEntityDefResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMetaEntityDefResponse self = new CreateMetaEntityDefResponse();
        return TeaModel.build(map, self);
    }

    public CreateMetaEntityDefResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMetaEntityDefResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMetaEntityDefResponse setBody(CreateMetaEntityDefResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMetaEntityDefResponseBody getBody() {
        return this.body;
    }

}
