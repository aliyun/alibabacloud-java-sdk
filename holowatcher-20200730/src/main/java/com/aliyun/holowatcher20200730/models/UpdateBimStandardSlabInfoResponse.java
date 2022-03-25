// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UpdateBimStandardSlabInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateBimStandardSlabInfoResponseBody body;

    public static UpdateBimStandardSlabInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBimStandardSlabInfoResponse self = new UpdateBimStandardSlabInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBimStandardSlabInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBimStandardSlabInfoResponse setBody(UpdateBimStandardSlabInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBimStandardSlabInfoResponseBody getBody() {
        return this.body;
    }

}
