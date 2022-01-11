// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.tea.*;

public class RpcDataUploadAndDownloadResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RpcDataUploadAndDownloadResponseBody body;

    public static RpcDataUploadAndDownloadResponse build(java.util.Map<String, ?> map) throws Exception {
        RpcDataUploadAndDownloadResponse self = new RpcDataUploadAndDownloadResponse();
        return TeaModel.build(map, self);
    }

    public RpcDataUploadAndDownloadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RpcDataUploadAndDownloadResponse setBody(RpcDataUploadAndDownloadResponseBody body) {
        this.body = body;
        return this;
    }
    public RpcDataUploadAndDownloadResponseBody getBody() {
        return this.body;
    }

}
