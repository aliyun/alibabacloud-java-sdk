// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmInstanceGlobalConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGtmInstanceGlobalConfigResponseBody body;

    public static UpdateGtmInstanceGlobalConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGtmInstanceGlobalConfigResponse self = new UpdateGtmInstanceGlobalConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGtmInstanceGlobalConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGtmInstanceGlobalConfigResponse setBody(UpdateGtmInstanceGlobalConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGtmInstanceGlobalConfigResponseBody getBody() {
        return this.body;
    }

}
