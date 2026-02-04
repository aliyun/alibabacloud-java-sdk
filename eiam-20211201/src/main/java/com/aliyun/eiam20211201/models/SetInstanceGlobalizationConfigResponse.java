// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetInstanceGlobalizationConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetInstanceGlobalizationConfigResponseBody body;

    public static SetInstanceGlobalizationConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetInstanceGlobalizationConfigResponse self = new SetInstanceGlobalizationConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetInstanceGlobalizationConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetInstanceGlobalizationConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetInstanceGlobalizationConfigResponse setBody(SetInstanceGlobalizationConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetInstanceGlobalizationConfigResponseBody getBody() {
        return this.body;
    }

}
