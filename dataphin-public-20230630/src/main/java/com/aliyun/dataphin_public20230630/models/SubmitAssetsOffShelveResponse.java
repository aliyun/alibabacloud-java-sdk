// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitAssetsOffShelveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitAssetsOffShelveResponseBody body;

    public static SubmitAssetsOffShelveResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAssetsOffShelveResponse self = new SubmitAssetsOffShelveResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAssetsOffShelveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAssetsOffShelveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAssetsOffShelveResponse setBody(SubmitAssetsOffShelveResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAssetsOffShelveResponseBody getBody() {
        return this.body;
    }

}
