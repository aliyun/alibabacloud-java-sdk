// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class GetSwitchValueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSwitchValueResponseBody body;

    public static GetSwitchValueResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSwitchValueResponse self = new GetSwitchValueResponse();
        return TeaModel.build(map, self);
    }

    public GetSwitchValueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSwitchValueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSwitchValueResponse setBody(GetSwitchValueResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSwitchValueResponseBody getBody() {
        return this.body;
    }

}
