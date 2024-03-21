// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetDcdnUserConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDcdnUserConfigResponseBody body;

    public static SetDcdnUserConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDcdnUserConfigResponse self = new SetDcdnUserConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetDcdnUserConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDcdnUserConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDcdnUserConfigResponse setBody(SetDcdnUserConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDcdnUserConfigResponseBody getBody() {
        return this.body;
    }

}
