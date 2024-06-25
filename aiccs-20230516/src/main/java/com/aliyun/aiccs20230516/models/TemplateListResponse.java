// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class TemplateListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TemplateListResponseBody body;

    public static TemplateListResponse build(java.util.Map<String, ?> map) throws Exception {
        TemplateListResponse self = new TemplateListResponse();
        return TeaModel.build(map, self);
    }

    public TemplateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TemplateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TemplateListResponse setBody(TemplateListResponseBody body) {
        this.body = body;
        return this;
    }
    public TemplateListResponseBody getBody() {
        return this.body;
    }

}
