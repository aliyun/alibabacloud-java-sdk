// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetPostScriptsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SetPostScriptsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetPostScriptsResponse setBody(SetPostScriptsResponseBody body) {
        this.body = body;
        return this;
    }
    public SetPostScriptsResponseBody getBody() {
        return this.body;
    }

}
