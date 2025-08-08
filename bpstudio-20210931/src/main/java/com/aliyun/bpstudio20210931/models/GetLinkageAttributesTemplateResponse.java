// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetLinkageAttributesTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLinkageAttributesTemplateResponseBody body;

    public static GetLinkageAttributesTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkageAttributesTemplateResponse self = new GetLinkageAttributesTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkageAttributesTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkageAttributesTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLinkageAttributesTemplateResponse setBody(GetLinkageAttributesTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkageAttributesTemplateResponseBody getBody() {
        return this.body;
    }

}
