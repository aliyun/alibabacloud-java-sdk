// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class SetSwitchValueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetSwitchValueResponseBody body;

    public static SetSwitchValueResponse build(java.util.Map<String, ?> map) throws Exception {
        SetSwitchValueResponse self = new SetSwitchValueResponse();
        return TeaModel.build(map, self);
    }

    public SetSwitchValueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetSwitchValueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetSwitchValueResponse setBody(SetSwitchValueResponseBody body) {
        this.body = body;
        return this;
    }
    public SetSwitchValueResponseBody getBody() {
        return this.body;
    }

}
