// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class RefreshUploadMediaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefreshUploadMediaResponseBody body;

    public static RefreshUploadMediaResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshUploadMediaResponse self = new RefreshUploadMediaResponse();
        return TeaModel.build(map, self);
    }

    public RefreshUploadMediaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshUploadMediaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshUploadMediaResponse setBody(RefreshUploadMediaResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshUploadMediaResponseBody getBody() {
        return this.body;
    }

}
