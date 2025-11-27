// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetAddonCodeTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAddonCodeTemplateResponseBody body;

    public static GetAddonCodeTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAddonCodeTemplateResponse self = new GetAddonCodeTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetAddonCodeTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAddonCodeTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAddonCodeTemplateResponse setBody(GetAddonCodeTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAddonCodeTemplateResponseBody getBody() {
        return this.body;
    }

}
