// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class MergeImageFaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MergeImageFaceResponseBody body;

    public static MergeImageFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        MergeImageFaceResponse self = new MergeImageFaceResponse();
        return TeaModel.build(map, self);
    }

    public MergeImageFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MergeImageFaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MergeImageFaceResponse setBody(MergeImageFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public MergeImageFaceResponseBody getBody() {
        return this.body;
    }

}
