// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamWatermarkRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveStreamWatermarkRulesResponseBody body;

    public static DescribeLiveStreamWatermarkRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamWatermarkRulesResponse self = new DescribeLiveStreamWatermarkRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamWatermarkRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamWatermarkRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveStreamWatermarkRulesResponse setBody(DescribeLiveStreamWatermarkRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamWatermarkRulesResponseBody getBody() {
        return this.body;
    }

}
