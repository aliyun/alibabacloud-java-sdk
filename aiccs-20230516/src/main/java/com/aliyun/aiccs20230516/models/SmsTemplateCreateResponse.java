// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class SmsTemplateCreateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SmsTemplateCreateResponseBody body;

    public static SmsTemplateCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        SmsTemplateCreateResponse self = new SmsTemplateCreateResponse();
        return TeaModel.build(map, self);
    }

    public SmsTemplateCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SmsTemplateCreateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SmsTemplateCreateResponse setBody(SmsTemplateCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public SmsTemplateCreateResponseBody getBody() {
        return this.body;
    }

}
