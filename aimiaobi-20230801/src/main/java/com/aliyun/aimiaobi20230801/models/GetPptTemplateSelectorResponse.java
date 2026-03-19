// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetPptTemplateSelectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPptTemplateSelectorResponseBody body;

    public static GetPptTemplateSelectorResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPptTemplateSelectorResponse self = new GetPptTemplateSelectorResponse();
        return TeaModel.build(map, self);
    }

    public GetPptTemplateSelectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPptTemplateSelectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPptTemplateSelectorResponse setBody(GetPptTemplateSelectorResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPptTemplateSelectorResponseBody getBody() {
        return this.body;
    }

}
