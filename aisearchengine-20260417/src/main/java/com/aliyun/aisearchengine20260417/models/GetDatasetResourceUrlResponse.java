// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearchengine20260417.models;

import com.aliyun.tea.*;

public class GetDatasetResourceUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDatasetResourceUrlResponseBody body;

    public static GetDatasetResourceUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetResourceUrlResponse self = new GetDatasetResourceUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetDatasetResourceUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDatasetResourceUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDatasetResourceUrlResponse setBody(GetDatasetResourceUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDatasetResourceUrlResponseBody getBody() {
        return this.body;
    }

}
