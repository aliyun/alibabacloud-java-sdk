// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkConfigLogPathResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSparkConfigLogPathResponseBody body;

    public static GetSparkConfigLogPathResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSparkConfigLogPathResponse self = new GetSparkConfigLogPathResponse();
        return TeaModel.build(map, self);
    }

    public GetSparkConfigLogPathResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSparkConfigLogPathResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSparkConfigLogPathResponse setBody(GetSparkConfigLogPathResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSparkConfigLogPathResponseBody getBody() {
        return this.body;
    }

}
