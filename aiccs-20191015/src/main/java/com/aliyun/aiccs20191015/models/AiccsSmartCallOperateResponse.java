// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AiccsSmartCallOperateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AiccsSmartCallOperateResponseBody body;

    public static AiccsSmartCallOperateResponse build(java.util.Map<String, ?> map) throws Exception {
        AiccsSmartCallOperateResponse self = new AiccsSmartCallOperateResponse();
        return TeaModel.build(map, self);
    }

    public AiccsSmartCallOperateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AiccsSmartCallOperateResponse setBody(AiccsSmartCallOperateResponseBody body) {
        this.body = body;
        return this;
    }
    public AiccsSmartCallOperateResponseBody getBody() {
        return this.body;
    }

}
