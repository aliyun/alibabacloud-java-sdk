// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetFileCacheExpiredConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetFileCacheExpiredConfigResponseBody body;

    public static SetFileCacheExpiredConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetFileCacheExpiredConfigResponse self = new SetFileCacheExpiredConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetFileCacheExpiredConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetFileCacheExpiredConfigResponse setBody(SetFileCacheExpiredConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetFileCacheExpiredConfigResponseBody getBody() {
        return this.body;
    }

}
