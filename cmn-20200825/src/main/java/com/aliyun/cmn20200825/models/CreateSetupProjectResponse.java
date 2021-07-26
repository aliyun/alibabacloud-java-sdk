// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateSetupProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSetupProjectResponseBody body;

    public static CreateSetupProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSetupProjectResponse self = new CreateSetupProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateSetupProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSetupProjectResponse setBody(CreateSetupProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSetupProjectResponseBody getBody() {
        return this.body;
    }

}
