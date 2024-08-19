// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetServiceLabelConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceLabelConfigResponseBody body;

    public static GetServiceLabelConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceLabelConfigResponse self = new GetServiceLabelConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceLabelConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceLabelConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceLabelConfigResponse setBody(GetServiceLabelConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceLabelConfigResponseBody getBody() {
        return this.body;
    }

}
