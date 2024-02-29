// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetBasicInfoQAResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBasicInfoQAResponseBody body;

    public static GetBasicInfoQAResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBasicInfoQAResponse self = new GetBasicInfoQAResponse();
        return TeaModel.build(map, self);
    }

    public GetBasicInfoQAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBasicInfoQAResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBasicInfoQAResponse setBody(GetBasicInfoQAResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBasicInfoQAResponseBody getBody() {
        return this.body;
    }

}
