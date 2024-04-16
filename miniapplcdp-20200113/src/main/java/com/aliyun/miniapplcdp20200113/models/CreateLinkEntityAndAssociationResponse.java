// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreateLinkEntityAndAssociationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLinkEntityAndAssociationResponseBody body;

    public static CreateLinkEntityAndAssociationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkEntityAndAssociationResponse self = new CreateLinkEntityAndAssociationResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkEntityAndAssociationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkEntityAndAssociationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLinkEntityAndAssociationResponse setBody(CreateLinkEntityAndAssociationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkEntityAndAssociationResponseBody getBody() {
        return this.body;
    }

}
