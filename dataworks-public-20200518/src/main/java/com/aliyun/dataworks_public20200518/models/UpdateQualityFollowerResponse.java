// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateQualityFollowerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateQualityFollowerResponseBody body;

    public static UpdateQualityFollowerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateQualityFollowerResponse self = new UpdateQualityFollowerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateQualityFollowerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateQualityFollowerResponse setBody(UpdateQualityFollowerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateQualityFollowerResponseBody getBody() {
        return this.body;
    }

}
