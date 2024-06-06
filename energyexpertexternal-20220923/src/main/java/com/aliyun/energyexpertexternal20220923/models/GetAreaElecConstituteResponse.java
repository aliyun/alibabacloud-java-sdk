// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetAreaElecConstituteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAreaElecConstituteResponseBody body;

    public static GetAreaElecConstituteResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAreaElecConstituteResponse self = new GetAreaElecConstituteResponse();
        return TeaModel.build(map, self);
    }

    public GetAreaElecConstituteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAreaElecConstituteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAreaElecConstituteResponse setBody(GetAreaElecConstituteResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAreaElecConstituteResponseBody getBody() {
        return this.body;
    }

}
