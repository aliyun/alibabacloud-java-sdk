// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateConfigurationSpecificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateConfigurationSpecificationResponseBody body;

    public static UpdateConfigurationSpecificationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigurationSpecificationResponse self = new UpdateConfigurationSpecificationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateConfigurationSpecificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateConfigurationSpecificationResponse setBody(UpdateConfigurationSpecificationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateConfigurationSpecificationResponseBody getBody() {
        return this.body;
    }

}
