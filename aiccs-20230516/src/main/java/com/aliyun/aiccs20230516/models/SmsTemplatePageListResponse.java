// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class SmsTemplatePageListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SmsTemplatePageListResponseBody body;

    public static SmsTemplatePageListResponse build(java.util.Map<String, ?> map) throws Exception {
        SmsTemplatePageListResponse self = new SmsTemplatePageListResponse();
        return TeaModel.build(map, self);
    }

    public SmsTemplatePageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SmsTemplatePageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SmsTemplatePageListResponse setBody(SmsTemplatePageListResponseBody body) {
        this.body = body;
        return this;
    }
    public SmsTemplatePageListResponseBody getBody() {
        return this.body;
    }

}
