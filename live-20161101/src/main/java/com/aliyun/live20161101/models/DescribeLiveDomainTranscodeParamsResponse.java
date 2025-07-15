// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainTranscodeParamsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveDomainTranscodeParamsResponseBody body;

    public static DescribeLiveDomainTranscodeParamsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainTranscodeParamsResponse self = new DescribeLiveDomainTranscodeParamsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainTranscodeParamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainTranscodeParamsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveDomainTranscodeParamsResponse setBody(DescribeLiveDomainTranscodeParamsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainTranscodeParamsResponseBody getBody() {
        return this.body;
    }

}
