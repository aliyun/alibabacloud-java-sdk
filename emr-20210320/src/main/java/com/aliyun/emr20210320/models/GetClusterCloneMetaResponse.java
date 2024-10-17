// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetClusterCloneMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetClusterCloneMetaResponseBody body;

    public static GetClusterCloneMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterCloneMetaResponse self = new GetClusterCloneMetaResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterCloneMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterCloneMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClusterCloneMetaResponse setBody(GetClusterCloneMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterCloneMetaResponseBody getBody() {
        return this.body;
    }

}
