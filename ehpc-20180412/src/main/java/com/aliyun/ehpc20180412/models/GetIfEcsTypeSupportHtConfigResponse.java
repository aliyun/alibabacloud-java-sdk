// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetIfEcsTypeSupportHtConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIfEcsTypeSupportHtConfigResponseBody body;

    public static GetIfEcsTypeSupportHtConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIfEcsTypeSupportHtConfigResponse self = new GetIfEcsTypeSupportHtConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetIfEcsTypeSupportHtConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIfEcsTypeSupportHtConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIfEcsTypeSupportHtConfigResponse setBody(GetIfEcsTypeSupportHtConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIfEcsTypeSupportHtConfigResponseBody getBody() {
        return this.body;
    }

}
