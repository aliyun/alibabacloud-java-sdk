// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateConfigurationVariateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateConfigurationVariateResponseBody body;

    public static UpdateConfigurationVariateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigurationVariateResponse self = new UpdateConfigurationVariateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateConfigurationVariateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateConfigurationVariateResponse setBody(UpdateConfigurationVariateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateConfigurationVariateResponseBody getBody() {
        return this.body;
    }

}
