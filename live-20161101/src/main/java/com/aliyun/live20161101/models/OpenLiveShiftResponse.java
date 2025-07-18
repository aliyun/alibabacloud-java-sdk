// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class OpenLiveShiftResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenLiveShiftResponseBody body;

    public static OpenLiveShiftResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenLiveShiftResponse self = new OpenLiveShiftResponse();
        return TeaModel.build(map, self);
    }

    public OpenLiveShiftResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenLiveShiftResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenLiveShiftResponse setBody(OpenLiveShiftResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenLiveShiftResponseBody getBody() {
        return this.body;
    }

}
