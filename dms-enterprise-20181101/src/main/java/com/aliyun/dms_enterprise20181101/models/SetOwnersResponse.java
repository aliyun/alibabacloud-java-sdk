// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SetOwnersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetOwnersResponseBody body;

    public static SetOwnersResponse build(java.util.Map<String, ?> map) throws Exception {
        SetOwnersResponse self = new SetOwnersResponse();
        return TeaModel.build(map, self);
    }

    public SetOwnersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetOwnersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetOwnersResponse setBody(SetOwnersResponseBody body) {
        this.body = body;
        return this;
    }
    public SetOwnersResponseBody getBody() {
        return this.body;
    }

}
