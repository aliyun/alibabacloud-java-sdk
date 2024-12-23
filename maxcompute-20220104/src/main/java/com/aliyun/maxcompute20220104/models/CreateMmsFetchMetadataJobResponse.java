// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateMmsFetchMetadataJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMmsFetchMetadataJobResponseBody body;

    public static CreateMmsFetchMetadataJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMmsFetchMetadataJobResponse self = new CreateMmsFetchMetadataJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateMmsFetchMetadataJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMmsFetchMetadataJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMmsFetchMetadataJobResponse setBody(CreateMmsFetchMetadataJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMmsFetchMetadataJobResponseBody getBody() {
        return this.body;
    }

}
