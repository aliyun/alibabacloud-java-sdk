// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateIpSetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateIpSetsResponseBody body;

    public static UpdateIpSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpSetsResponse self = new UpdateIpSetsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIpSetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIpSetsResponse setBody(UpdateIpSetsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIpSetsResponseBody getBody() {
        return this.body;
    }

}
