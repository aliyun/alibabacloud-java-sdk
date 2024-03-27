// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RevokeTemplateAuthorityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeTemplateAuthorityResponseBody body;

    public static RevokeTemplateAuthorityResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeTemplateAuthorityResponse self = new RevokeTemplateAuthorityResponse();
        return TeaModel.build(map, self);
    }

    public RevokeTemplateAuthorityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeTemplateAuthorityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeTemplateAuthorityResponse setBody(RevokeTemplateAuthorityResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeTemplateAuthorityResponseBody getBody() {
        return this.body;
    }

}
