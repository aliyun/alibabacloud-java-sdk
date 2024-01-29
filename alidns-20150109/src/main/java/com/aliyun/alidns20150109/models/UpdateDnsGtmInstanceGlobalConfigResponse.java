// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsGtmInstanceGlobalConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDnsGtmInstanceGlobalConfigResponseBody body;

    public static UpdateDnsGtmInstanceGlobalConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDnsGtmInstanceGlobalConfigResponse self = new UpdateDnsGtmInstanceGlobalConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDnsGtmInstanceGlobalConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDnsGtmInstanceGlobalConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDnsGtmInstanceGlobalConfigResponse setBody(UpdateDnsGtmInstanceGlobalConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDnsGtmInstanceGlobalConfigResponseBody getBody() {
        return this.body;
    }

}
