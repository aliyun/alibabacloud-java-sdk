// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateBasicIpSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBasicIpSetResponseBody body;

    public static UpdateBasicIpSetResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBasicIpSetResponse self = new UpdateBasicIpSetResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBasicIpSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBasicIpSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBasicIpSetResponse setBody(UpdateBasicIpSetResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBasicIpSetResponseBody getBody() {
        return this.body;
    }

}
