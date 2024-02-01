// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class ClearFaceDeviceDBResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClearFaceDeviceDBResponseBody body;

    public static ClearFaceDeviceDBResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearFaceDeviceDBResponse self = new ClearFaceDeviceDBResponse();
        return TeaModel.build(map, self);
    }

    public ClearFaceDeviceDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClearFaceDeviceDBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClearFaceDeviceDBResponse setBody(ClearFaceDeviceDBResponseBody body) {
        this.body = body;
        return this;
    }
    public ClearFaceDeviceDBResponseBody getBody() {
        return this.body;
    }

}
