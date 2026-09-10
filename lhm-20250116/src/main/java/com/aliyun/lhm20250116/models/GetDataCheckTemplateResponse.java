// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetDataCheckTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataCheckTemplateResponseBody body;

    public static GetDataCheckTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataCheckTemplateResponse self = new GetDataCheckTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetDataCheckTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataCheckTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataCheckTemplateResponse setBody(GetDataCheckTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataCheckTemplateResponseBody getBody() {
        return this.body;
    }

}
