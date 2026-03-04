// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateYikeAssetUploadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateYikeAssetUploadResponseBody body;

    public static CreateYikeAssetUploadResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateYikeAssetUploadResponse self = new CreateYikeAssetUploadResponse();
        return TeaModel.build(map, self);
    }

    public CreateYikeAssetUploadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateYikeAssetUploadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateYikeAssetUploadResponse setBody(CreateYikeAssetUploadResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateYikeAssetUploadResponseBody getBody() {
        return this.body;
    }

}
