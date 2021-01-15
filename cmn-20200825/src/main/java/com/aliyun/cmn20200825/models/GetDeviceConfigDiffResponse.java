// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetDeviceConfigDiffResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeviceConfigDiffResponseBody body;

    public static GetDeviceConfigDiffResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceConfigDiffResponse self = new GetDeviceConfigDiffResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceConfigDiffResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceConfigDiffResponse setBody(GetDeviceConfigDiffResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceConfigDiffResponseBody getBody() {
        return this.body;
    }

}
