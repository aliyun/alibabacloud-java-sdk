// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class GetInstancePropertiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstancePropertiesResponseBody body;

    public static GetInstancePropertiesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstancePropertiesResponse self = new GetInstancePropertiesResponse();
        return TeaModel.build(map, self);
    }

    public GetInstancePropertiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstancePropertiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstancePropertiesResponse setBody(GetInstancePropertiesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstancePropertiesResponseBody getBody() {
        return this.body;
    }

}
