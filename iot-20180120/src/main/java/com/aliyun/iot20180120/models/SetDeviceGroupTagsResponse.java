// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetDeviceGroupTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDeviceGroupTagsResponseBody body;

    public static SetDeviceGroupTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDeviceGroupTagsResponse self = new SetDeviceGroupTagsResponse();
        return TeaModel.build(map, self);
    }

    public SetDeviceGroupTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDeviceGroupTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDeviceGroupTagsResponse setBody(SetDeviceGroupTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDeviceGroupTagsResponseBody getBody() {
        return this.body;
    }

}
