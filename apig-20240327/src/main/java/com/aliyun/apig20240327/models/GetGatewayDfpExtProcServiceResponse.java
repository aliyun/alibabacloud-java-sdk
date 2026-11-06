// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetGatewayDfpExtProcServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGatewayDfpExtProcServiceResponseBody body;

    public static GetGatewayDfpExtProcServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayDfpExtProcServiceResponse self = new GetGatewayDfpExtProcServiceResponse();
        return TeaModel.build(map, self);
    }

    public GetGatewayDfpExtProcServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGatewayDfpExtProcServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGatewayDfpExtProcServiceResponse setBody(GetGatewayDfpExtProcServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGatewayDfpExtProcServiceResponseBody getBody() {
        return this.body;
    }

}
