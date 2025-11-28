// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class UploadIoTDataToBlockchainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadIoTDataToBlockchainResponseBody body;

    public static UploadIoTDataToBlockchainResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadIoTDataToBlockchainResponse self = new UploadIoTDataToBlockchainResponse();
        return TeaModel.build(map, self);
    }

    public UploadIoTDataToBlockchainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadIoTDataToBlockchainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadIoTDataToBlockchainResponse setBody(UploadIoTDataToBlockchainResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadIoTDataToBlockchainResponseBody getBody() {
        return this.body;
    }

}
