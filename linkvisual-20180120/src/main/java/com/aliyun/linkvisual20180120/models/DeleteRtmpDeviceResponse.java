// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteRtmpDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRtmpDeviceResponseBody body;

    public static DeleteRtmpDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRtmpDeviceResponse self = new DeleteRtmpDeviceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRtmpDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRtmpDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRtmpDeviceResponse setBody(DeleteRtmpDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRtmpDeviceResponseBody getBody() {
        return this.body;
    }

}
