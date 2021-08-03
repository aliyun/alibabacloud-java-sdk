// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateADConnectorOfficeSiteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateADConnectorOfficeSiteResponseBody body;

    public static CreateADConnectorOfficeSiteResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateADConnectorOfficeSiteResponse self = new CreateADConnectorOfficeSiteResponse();
        return TeaModel.build(map, self);
    }

    public CreateADConnectorOfficeSiteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateADConnectorOfficeSiteResponse setBody(CreateADConnectorOfficeSiteResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateADConnectorOfficeSiteResponseBody getBody() {
        return this.body;
    }

}
