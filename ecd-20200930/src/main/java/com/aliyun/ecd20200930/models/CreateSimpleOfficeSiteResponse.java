// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateSimpleOfficeSiteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSimpleOfficeSiteResponseBody body;

    public static CreateSimpleOfficeSiteResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSimpleOfficeSiteResponse self = new CreateSimpleOfficeSiteResponse();
        return TeaModel.build(map, self);
    }

    public CreateSimpleOfficeSiteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSimpleOfficeSiteResponse setBody(CreateSimpleOfficeSiteResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSimpleOfficeSiteResponseBody getBody() {
        return this.body;
    }

}
