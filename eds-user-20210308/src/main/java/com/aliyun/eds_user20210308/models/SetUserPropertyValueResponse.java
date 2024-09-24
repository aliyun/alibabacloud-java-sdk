// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class SetUserPropertyValueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetUserPropertyValueResponseBody body;

    public static SetUserPropertyValueResponse build(java.util.Map<String, ?> map) throws Exception {
        SetUserPropertyValueResponse self = new SetUserPropertyValueResponse();
        return TeaModel.build(map, self);
    }

    public SetUserPropertyValueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetUserPropertyValueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetUserPropertyValueResponse setBody(SetUserPropertyValueResponseBody body) {
        this.body = body;
        return this;
    }
    public SetUserPropertyValueResponseBody getBody() {
        return this.body;
    }

}
