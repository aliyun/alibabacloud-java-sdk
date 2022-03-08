// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ei_iot_openapi20211104.models;

import com.aliyun.tea.*;

public class GetTemplatePropertyValueByCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public Response body;

    public static GetTemplatePropertyValueByCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTemplatePropertyValueByCodeResponse self = new GetTemplatePropertyValueByCodeResponse();
        return TeaModel.build(map, self);
    }

    public GetTemplatePropertyValueByCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTemplatePropertyValueByCodeResponse setBody(Response body) {
        this.body = body;
        return this;
    }
    public Response getBody() {
        return this.body;
    }

}
