// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitAssetsOnShelveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitAssetsOnShelveResponseBody body;

    public static SubmitAssetsOnShelveResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAssetsOnShelveResponse self = new SubmitAssetsOnShelveResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAssetsOnShelveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAssetsOnShelveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAssetsOnShelveResponse setBody(SubmitAssetsOnShelveResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAssetsOnShelveResponseBody getBody() {
        return this.body;
    }

}
