// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GrantTemplateAuthorityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrantTemplateAuthorityResponseBody body;

    public static GrantTemplateAuthorityResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantTemplateAuthorityResponse self = new GrantTemplateAuthorityResponse();
        return TeaModel.build(map, self);
    }

    public GrantTemplateAuthorityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantTemplateAuthorityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantTemplateAuthorityResponse setBody(GrantTemplateAuthorityResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantTemplateAuthorityResponseBody getBody() {
        return this.body;
    }

}
