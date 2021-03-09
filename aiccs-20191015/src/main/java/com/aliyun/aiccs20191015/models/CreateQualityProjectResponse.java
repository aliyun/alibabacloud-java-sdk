// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateQualityProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateQualityProjectResponseBody body;

    public static CreateQualityProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateQualityProjectResponse self = new CreateQualityProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateQualityProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateQualityProjectResponse setBody(CreateQualityProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateQualityProjectResponseBody getBody() {
        return this.body;
    }

}
