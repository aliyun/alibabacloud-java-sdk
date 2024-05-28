// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmInstanceConfigRemarkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCloudGtmInstanceConfigRemarkResponseBody body;

    public static UpdateCloudGtmInstanceConfigRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmInstanceConfigRemarkResponse self = new UpdateCloudGtmInstanceConfigRemarkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmInstanceConfigRemarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCloudGtmInstanceConfigRemarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCloudGtmInstanceConfigRemarkResponse setBody(UpdateCloudGtmInstanceConfigRemarkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCloudGtmInstanceConfigRemarkResponseBody getBody() {
        return this.body;
    }

}
