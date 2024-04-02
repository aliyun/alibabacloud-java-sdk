// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreateWebsiteIndexPageBaselineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWebsiteIndexPageBaselineResponseBody body;

    public static CreateWebsiteIndexPageBaselineResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWebsiteIndexPageBaselineResponse self = new CreateWebsiteIndexPageBaselineResponse();
        return TeaModel.build(map, self);
    }

    public CreateWebsiteIndexPageBaselineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWebsiteIndexPageBaselineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWebsiteIndexPageBaselineResponse setBody(CreateWebsiteIndexPageBaselineResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWebsiteIndexPageBaselineResponseBody getBody() {
        return this.body;
    }

}
