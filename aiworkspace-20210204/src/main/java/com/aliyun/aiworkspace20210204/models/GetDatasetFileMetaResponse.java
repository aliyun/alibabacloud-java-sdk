// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetDatasetFileMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDatasetFileMetaResponseBody body;

    public static GetDatasetFileMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetFileMetaResponse self = new GetDatasetFileMetaResponse();
        return TeaModel.build(map, self);
    }

    public GetDatasetFileMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDatasetFileMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDatasetFileMetaResponse setBody(GetDatasetFileMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDatasetFileMetaResponseBody getBody() {
        return this.body;
    }

}
