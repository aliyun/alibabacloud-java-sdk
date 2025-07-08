// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class UpdatePartnerTemplateNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePartnerTemplateNewResponseBody body;

    public static UpdatePartnerTemplateNewResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePartnerTemplateNewResponse self = new UpdatePartnerTemplateNewResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePartnerTemplateNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePartnerTemplateNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePartnerTemplateNewResponse setBody(UpdatePartnerTemplateNewResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePartnerTemplateNewResponseBody getBody() {
        return this.body;
    }

}
