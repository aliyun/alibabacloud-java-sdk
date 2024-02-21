// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnConditionIPBInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdnConditionIPBInfoResponseBody body;

    public static DescribeCdnConditionIPBInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnConditionIPBInfoResponse self = new DescribeCdnConditionIPBInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnConditionIPBInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnConditionIPBInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnConditionIPBInfoResponse setBody(DescribeCdnConditionIPBInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnConditionIPBInfoResponseBody getBody() {
        return this.body;
    }

}
