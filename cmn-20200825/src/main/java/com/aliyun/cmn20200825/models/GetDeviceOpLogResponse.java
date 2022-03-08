// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetDeviceOpLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeviceOpLogResponseBody body;

    public static GetDeviceOpLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceOpLogResponse self = new GetDeviceOpLogResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceOpLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceOpLogResponse setBody(GetDeviceOpLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceOpLogResponseBody getBody() {
        return this.body;
    }

}
