// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class UpdateInstanceIpWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateInstanceIpWhiteListResponseBody body;

    public static UpdateInstanceIpWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceIpWhiteListResponse self = new UpdateInstanceIpWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceIpWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceIpWhiteListResponse setBody(UpdateInstanceIpWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceIpWhiteListResponseBody getBody() {
        return this.body;
    }

}
