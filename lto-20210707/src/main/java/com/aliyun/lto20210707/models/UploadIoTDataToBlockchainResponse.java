// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class UploadIoTDataToBlockchainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UploadIoTDataToBlockchainResponse setBody(UploadIoTDataToBlockchainResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadIoTDataToBlockchainResponseBody getBody() {
        return this.body;
    }

}
