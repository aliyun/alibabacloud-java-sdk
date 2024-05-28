// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmInstanceNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCloudGtmInstanceNameResponseBody body;

    public static UpdateCloudGtmInstanceNameResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmInstanceNameResponse self = new UpdateCloudGtmInstanceNameResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmInstanceNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCloudGtmInstanceNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCloudGtmInstanceNameResponse setBody(UpdateCloudGtmInstanceNameResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCloudGtmInstanceNameResponseBody getBody() {
        return this.body;
    }

}
