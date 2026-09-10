// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class PostInnerUploadConvertPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PostInnerUploadConvertPackageResponseBody body;

    public static PostInnerUploadConvertPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        PostInnerUploadConvertPackageResponse self = new PostInnerUploadConvertPackageResponse();
        return TeaModel.build(map, self);
    }

    public PostInnerUploadConvertPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PostInnerUploadConvertPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PostInnerUploadConvertPackageResponse setBody(PostInnerUploadConvertPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public PostInnerUploadConvertPackageResponseBody getBody() {
        return this.body;
    }

}
