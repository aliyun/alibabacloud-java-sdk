// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateChannelConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateChannelConfigResponseBody body;

    public static UpdateChannelConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateChannelConfigResponse self = new UpdateChannelConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateChannelConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateChannelConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateChannelConfigResponse setBody(UpdateChannelConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateChannelConfigResponseBody getBody() {
        return this.body;
    }

}
