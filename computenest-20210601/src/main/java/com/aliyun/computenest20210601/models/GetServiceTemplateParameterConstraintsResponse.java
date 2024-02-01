// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetServiceTemplateParameterConstraintsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceTemplateParameterConstraintsResponseBody body;

    public static GetServiceTemplateParameterConstraintsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceTemplateParameterConstraintsResponse self = new GetServiceTemplateParameterConstraintsResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceTemplateParameterConstraintsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceTemplateParameterConstraintsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceTemplateParameterConstraintsResponse setBody(GetServiceTemplateParameterConstraintsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceTemplateParameterConstraintsResponseBody getBody() {
        return this.body;
    }

}
