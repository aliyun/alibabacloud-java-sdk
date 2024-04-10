// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappTemplateMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetChatappTemplateMetricResponseBody body;

    public static GetChatappTemplateMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChatappTemplateMetricResponse self = new GetChatappTemplateMetricResponse();
        return TeaModel.build(map, self);
    }

    public GetChatappTemplateMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChatappTemplateMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetChatappTemplateMetricResponse setBody(GetChatappTemplateMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChatappTemplateMetricResponseBody getBody() {
        return this.body;
    }

}
