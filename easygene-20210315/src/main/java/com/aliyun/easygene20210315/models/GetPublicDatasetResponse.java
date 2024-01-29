// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetPublicDatasetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPublicDatasetResponseBody body;

    public static GetPublicDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPublicDatasetResponse self = new GetPublicDatasetResponse();
        return TeaModel.build(map, self);
    }

    public GetPublicDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPublicDatasetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPublicDatasetResponse setBody(GetPublicDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPublicDatasetResponseBody getBody() {
        return this.body;
    }

}
