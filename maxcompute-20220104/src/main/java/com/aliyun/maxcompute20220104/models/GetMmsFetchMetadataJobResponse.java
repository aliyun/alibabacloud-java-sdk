// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetMmsFetchMetadataJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMmsFetchMetadataJobResponseBody body;

    public static GetMmsFetchMetadataJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMmsFetchMetadataJobResponse self = new GetMmsFetchMetadataJobResponse();
        return TeaModel.build(map, self);
    }

    public GetMmsFetchMetadataJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMmsFetchMetadataJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMmsFetchMetadataJobResponse setBody(GetMmsFetchMetadataJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMmsFetchMetadataJobResponseBody getBody() {
        return this.body;
    }

}
