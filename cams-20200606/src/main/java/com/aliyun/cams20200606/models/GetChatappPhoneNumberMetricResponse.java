// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappPhoneNumberMetricResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetChatappPhoneNumberMetricResponseBody body;

    public static GetChatappPhoneNumberMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChatappPhoneNumberMetricResponse self = new GetChatappPhoneNumberMetricResponse();
        return TeaModel.build(map, self);
    }

    public GetChatappPhoneNumberMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChatappPhoneNumberMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetChatappPhoneNumberMetricResponse setBody(GetChatappPhoneNumberMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChatappPhoneNumberMetricResponseBody getBody() {
        return this.body;
    }

}
