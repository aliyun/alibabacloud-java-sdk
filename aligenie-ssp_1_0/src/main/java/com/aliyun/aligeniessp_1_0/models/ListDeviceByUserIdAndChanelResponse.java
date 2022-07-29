// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListDeviceByUserIdAndChanelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDeviceByUserIdAndChanelResponseBody body;

    public static ListDeviceByUserIdAndChanelResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceByUserIdAndChanelResponse self = new ListDeviceByUserIdAndChanelResponse();
        return TeaModel.build(map, self);
    }

    public ListDeviceByUserIdAndChanelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeviceByUserIdAndChanelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeviceByUserIdAndChanelResponse setBody(ListDeviceByUserIdAndChanelResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeviceByUserIdAndChanelResponseBody getBody() {
        return this.body;
    }

}
