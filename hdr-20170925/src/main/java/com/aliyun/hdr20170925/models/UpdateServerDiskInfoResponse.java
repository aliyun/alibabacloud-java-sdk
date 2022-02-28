// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class UpdateServerDiskInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateServerDiskInfoResponseBody body;

    public static UpdateServerDiskInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServerDiskInfoResponse self = new UpdateServerDiskInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServerDiskInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServerDiskInfoResponse setBody(UpdateServerDiskInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServerDiskInfoResponseBody getBody() {
        return this.body;
    }

}
