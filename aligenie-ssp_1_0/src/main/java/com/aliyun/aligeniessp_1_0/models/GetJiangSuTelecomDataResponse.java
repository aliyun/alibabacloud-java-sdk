// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetJiangSuTelecomDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetJiangSuTelecomDataResponseBody body;

    public static GetJiangSuTelecomDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJiangSuTelecomDataResponse self = new GetJiangSuTelecomDataResponse();
        return TeaModel.build(map, self);
    }

    public GetJiangSuTelecomDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJiangSuTelecomDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJiangSuTelecomDataResponse setBody(GetJiangSuTelecomDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJiangSuTelecomDataResponseBody getBody() {
        return this.body;
    }

}
