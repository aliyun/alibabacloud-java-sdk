// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeThreatIntelligenceSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeThreatIntelligenceSwitchResponseBody body;

    public static DescribeThreatIntelligenceSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeThreatIntelligenceSwitchResponse self = new DescribeThreatIntelligenceSwitchResponse();
        return TeaModel.build(map, self);
    }

    public DescribeThreatIntelligenceSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeThreatIntelligenceSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeThreatIntelligenceSwitchResponse setBody(DescribeThreatIntelligenceSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeThreatIntelligenceSwitchResponseBody getBody() {
        return this.body;
    }

}
