// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBaselineConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBaselineConfigResponseBody body;

    public static GetBaselineConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBaselineConfigResponse self = new GetBaselineConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetBaselineConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBaselineConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBaselineConfigResponse setBody(GetBaselineConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBaselineConfigResponseBody getBody() {
        return this.body;
    }

}
