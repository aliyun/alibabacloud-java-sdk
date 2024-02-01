// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateInstanceInternetProtocolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInstanceInternetProtocolResponseBody body;

    public static UpdateInstanceInternetProtocolResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceInternetProtocolResponse self = new UpdateInstanceInternetProtocolResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceInternetProtocolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceInternetProtocolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstanceInternetProtocolResponse setBody(UpdateInstanceInternetProtocolResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceInternetProtocolResponseBody getBody() {
        return this.body;
    }

}
