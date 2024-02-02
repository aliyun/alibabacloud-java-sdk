// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ConvertNatPublicIpToEipResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConvertNatPublicIpToEipResponseBody body;

    public static ConvertNatPublicIpToEipResponse build(java.util.Map<String, ?> map) throws Exception {
        ConvertNatPublicIpToEipResponse self = new ConvertNatPublicIpToEipResponse();
        return TeaModel.build(map, self);
    }

    public ConvertNatPublicIpToEipResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConvertNatPublicIpToEipResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConvertNatPublicIpToEipResponse setBody(ConvertNatPublicIpToEipResponseBody body) {
        this.body = body;
        return this;
    }
    public ConvertNatPublicIpToEipResponseBody getBody() {
        return this.body;
    }

}
