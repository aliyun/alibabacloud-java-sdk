// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateResourceInformationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateResourceInformationResponseBody body;

    public static UpdateResourceInformationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceInformationResponse self = new UpdateResourceInformationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateResourceInformationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateResourceInformationResponse setBody(UpdateResourceInformationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateResourceInformationResponseBody getBody() {
        return this.body;
    }

}
