// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateCustomAudienceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomAudienceResponseBody body;

    public static CreateCustomAudienceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomAudienceResponse self = new CreateCustomAudienceResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomAudienceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomAudienceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomAudienceResponse setBody(CreateCustomAudienceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomAudienceResponseBody getBody() {
        return this.body;
    }

}
