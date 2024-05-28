// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreateCloudGtmInstanceConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCloudGtmInstanceConfigResponseBody body;

    public static CreateCloudGtmInstanceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudGtmInstanceConfigResponse self = new CreateCloudGtmInstanceConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateCloudGtmInstanceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCloudGtmInstanceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCloudGtmInstanceConfigResponse setBody(CreateCloudGtmInstanceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCloudGtmInstanceConfigResponseBody getBody() {
        return this.body;
    }

}
