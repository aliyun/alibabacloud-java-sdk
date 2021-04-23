// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CloseLiveShiftResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CloseLiveShiftResponseBody body;

    public static CloseLiveShiftResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseLiveShiftResponse self = new CloseLiveShiftResponse();
        return TeaModel.build(map, self);
    }

    public CloseLiveShiftResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseLiveShiftResponse setBody(CloseLiveShiftResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseLiveShiftResponseBody getBody() {
        return this.body;
    }

}
