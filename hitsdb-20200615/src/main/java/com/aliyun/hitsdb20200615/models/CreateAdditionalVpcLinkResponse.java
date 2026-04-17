// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class CreateAdditionalVpcLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAdditionalVpcLinkResponseBody body;

    public static CreateAdditionalVpcLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAdditionalVpcLinkResponse self = new CreateAdditionalVpcLinkResponse();
        return TeaModel.build(map, self);
    }

    public CreateAdditionalVpcLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAdditionalVpcLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAdditionalVpcLinkResponse setBody(CreateAdditionalVpcLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAdditionalVpcLinkResponseBody getBody() {
        return this.body;
    }

}
