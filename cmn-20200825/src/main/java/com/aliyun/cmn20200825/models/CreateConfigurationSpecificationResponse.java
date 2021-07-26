// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateConfigurationSpecificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateConfigurationSpecificationResponseBody body;

    public static CreateConfigurationSpecificationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigurationSpecificationResponse self = new CreateConfigurationSpecificationResponse();
        return TeaModel.build(map, self);
    }

    public CreateConfigurationSpecificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConfigurationSpecificationResponse setBody(CreateConfigurationSpecificationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConfigurationSpecificationResponseBody getBody() {
        return this.body;
    }

}
