// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetAntStaStatusByMacResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAntStaStatusByMacResponseBody body;

    public static GetAntStaStatusByMacResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAntStaStatusByMacResponse self = new GetAntStaStatusByMacResponse();
        return TeaModel.build(map, self);
    }

    public GetAntStaStatusByMacResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAntStaStatusByMacResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAntStaStatusByMacResponse setBody(GetAntStaStatusByMacResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAntStaStatusByMacResponseBody getBody() {
        return this.body;
    }

}
