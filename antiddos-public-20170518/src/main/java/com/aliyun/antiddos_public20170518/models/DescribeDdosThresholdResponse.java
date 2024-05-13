// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeDdosThresholdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDdosThresholdResponseBody body;

    public static DescribeDdosThresholdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosThresholdResponse self = new DescribeDdosThresholdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDdosThresholdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDdosThresholdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDdosThresholdResponse setBody(DescribeDdosThresholdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDdosThresholdResponseBody getBody() {
        return this.body;
    }

}
