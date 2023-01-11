// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class GetNodeByTemplateIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetNodeByTemplateIdResponseBody body;

    public static GetNodeByTemplateIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNodeByTemplateIdResponse self = new GetNodeByTemplateIdResponse();
        return TeaModel.build(map, self);
    }

    public GetNodeByTemplateIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNodeByTemplateIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNodeByTemplateIdResponse setBody(GetNodeByTemplateIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNodeByTemplateIdResponseBody getBody() {
        return this.body;
    }

}
