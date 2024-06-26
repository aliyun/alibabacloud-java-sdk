// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmInstanceConfigBasicResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCloudGtmInstanceConfigBasicResponseBody body;

    public static UpdateCloudGtmInstanceConfigBasicResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmInstanceConfigBasicResponse self = new UpdateCloudGtmInstanceConfigBasicResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmInstanceConfigBasicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCloudGtmInstanceConfigBasicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCloudGtmInstanceConfigBasicResponse setBody(UpdateCloudGtmInstanceConfigBasicResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCloudGtmInstanceConfigBasicResponseBody getBody() {
        return this.body;
    }

}
