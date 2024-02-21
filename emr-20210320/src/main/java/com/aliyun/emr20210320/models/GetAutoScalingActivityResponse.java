// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetAutoScalingActivityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAutoScalingActivityResponseBody body;

    public static GetAutoScalingActivityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAutoScalingActivityResponse self = new GetAutoScalingActivityResponse();
        return TeaModel.build(map, self);
    }

    public GetAutoScalingActivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAutoScalingActivityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAutoScalingActivityResponse setBody(GetAutoScalingActivityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAutoScalingActivityResponseBody getBody() {
        return this.body;
    }

}
