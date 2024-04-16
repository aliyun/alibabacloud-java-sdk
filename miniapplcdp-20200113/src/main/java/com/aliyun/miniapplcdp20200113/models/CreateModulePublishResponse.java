// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreateModulePublishResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateModulePublishResponseBody body;

    public static CreateModulePublishResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateModulePublishResponse self = new CreateModulePublishResponse();
        return TeaModel.build(map, self);
    }

    public CreateModulePublishResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateModulePublishResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateModulePublishResponse setBody(CreateModulePublishResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateModulePublishResponseBody getBody() {
        return this.body;
    }

}
