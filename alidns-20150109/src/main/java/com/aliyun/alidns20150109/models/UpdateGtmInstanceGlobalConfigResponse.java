// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmInstanceGlobalConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateGtmInstanceGlobalConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGtmInstanceGlobalConfigResponse setBody(UpdateGtmInstanceGlobalConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGtmInstanceGlobalConfigResponseBody getBody() {
        return this.body;
    }

}
