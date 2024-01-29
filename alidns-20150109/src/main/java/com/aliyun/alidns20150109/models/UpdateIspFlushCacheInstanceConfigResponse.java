// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateIspFlushCacheInstanceConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateIspFlushCacheInstanceConfigResponseBody body;

    public static UpdateIspFlushCacheInstanceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIspFlushCacheInstanceConfigResponse self = new UpdateIspFlushCacheInstanceConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIspFlushCacheInstanceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIspFlushCacheInstanceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIspFlushCacheInstanceConfigResponse setBody(UpdateIspFlushCacheInstanceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIspFlushCacheInstanceConfigResponseBody getBody() {
        return this.body;
    }

}
