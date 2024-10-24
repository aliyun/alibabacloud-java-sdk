// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetDatasetVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDatasetVersionResponseBody body;

    public static GetDatasetVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetVersionResponse self = new GetDatasetVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetDatasetVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDatasetVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDatasetVersionResponse setBody(GetDatasetVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDatasetVersionResponseBody getBody() {
        return this.body;
    }

}
