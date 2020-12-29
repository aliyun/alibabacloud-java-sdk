// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SetRetcodeShareStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetRetcodeShareStatusResponseBody body;

    public static SetRetcodeShareStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetRetcodeShareStatusResponse self = new SetRetcodeShareStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetRetcodeShareStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetRetcodeShareStatusResponse setBody(SetRetcodeShareStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetRetcodeShareStatusResponseBody getBody() {
        return this.body;
    }

}
