// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetCloudGtmInstanceConfigLogSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetCloudGtmInstanceConfigLogSwitchResponseBody body;

    public static SetCloudGtmInstanceConfigLogSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCloudGtmInstanceConfigLogSwitchResponse self = new SetCloudGtmInstanceConfigLogSwitchResponse();
        return TeaModel.build(map, self);
    }

    public SetCloudGtmInstanceConfigLogSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetCloudGtmInstanceConfigLogSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetCloudGtmInstanceConfigLogSwitchResponse setBody(SetCloudGtmInstanceConfigLogSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public SetCloudGtmInstanceConfigLogSwitchResponseBody getBody() {
        return this.body;
    }

}
