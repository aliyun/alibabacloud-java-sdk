// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetSmsTemplateListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSmsTemplateListResponseBody body;

    public static GetSmsTemplateListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSmsTemplateListResponse self = new GetSmsTemplateListResponse();
        return TeaModel.build(map, self);
    }

    public GetSmsTemplateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSmsTemplateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSmsTemplateListResponse setBody(GetSmsTemplateListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSmsTemplateListResponseBody getBody() {
        return this.body;
    }

}
