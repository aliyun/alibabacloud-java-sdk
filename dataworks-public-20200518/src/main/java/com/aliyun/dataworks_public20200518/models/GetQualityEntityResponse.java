// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetQualityEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQualityEntityResponseBody body;

    public static GetQualityEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualityEntityResponse self = new GetQualityEntityResponse();
        return TeaModel.build(map, self);
    }

    public GetQualityEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQualityEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQualityEntityResponse setBody(GetQualityEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQualityEntityResponseBody getBody() {
        return this.body;
    }

}
