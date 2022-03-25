// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UpdateBimProjectDrawFilesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateBimProjectDrawFilesResponseBody body;

    public static UpdateBimProjectDrawFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBimProjectDrawFilesResponse self = new UpdateBimProjectDrawFilesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBimProjectDrawFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBimProjectDrawFilesResponse setBody(UpdateBimProjectDrawFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBimProjectDrawFilesResponseBody getBody() {
        return this.body;
    }

}
