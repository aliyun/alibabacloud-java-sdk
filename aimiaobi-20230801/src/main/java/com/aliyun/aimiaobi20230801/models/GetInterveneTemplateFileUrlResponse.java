// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetInterveneTemplateFileUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInterveneTemplateFileUrlResponseBody body;

    public static GetInterveneTemplateFileUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInterveneTemplateFileUrlResponse self = new GetInterveneTemplateFileUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetInterveneTemplateFileUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInterveneTemplateFileUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInterveneTemplateFileUrlResponse setBody(GetInterveneTemplateFileUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInterveneTemplateFileUrlResponseBody getBody() {
        return this.body;
    }

}
