// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetAdvancedQueryTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAdvancedQueryTemplateResponseBody body;

    public static GetAdvancedQueryTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAdvancedQueryTemplateResponse self = new GetAdvancedQueryTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetAdvancedQueryTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAdvancedQueryTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAdvancedQueryTemplateResponse setBody(GetAdvancedQueryTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAdvancedQueryTemplateResponseBody getBody() {
        return this.body;
    }

}
