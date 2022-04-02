// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetPostScriptsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetPostScriptsResponseBody body;

    public static SetPostScriptsResponse build(java.util.Map<String, ?> map) throws Exception {
        SetPostScriptsResponse self = new SetPostScriptsResponse();
        return TeaModel.build(map, self);
    }

    public SetPostScriptsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetPostScriptsResponse setBody(SetPostScriptsResponseBody body) {
        this.body = body;
        return this;
    }
    public SetPostScriptsResponseBody getBody() {
        return this.body;
    }

}
