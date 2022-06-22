// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetSwitchPersistValueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSwitchPersistValueResponseBody body;

    public static GetSwitchPersistValueResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSwitchPersistValueResponse self = new GetSwitchPersistValueResponse();
        return TeaModel.build(map, self);
    }

    public GetSwitchPersistValueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSwitchPersistValueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSwitchPersistValueResponse setBody(GetSwitchPersistValueResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSwitchPersistValueResponseBody getBody() {
        return this.body;
    }

}
