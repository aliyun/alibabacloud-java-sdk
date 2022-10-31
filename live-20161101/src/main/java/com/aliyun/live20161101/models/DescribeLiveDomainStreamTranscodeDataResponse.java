// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainStreamTranscodeDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveDomainStreamTranscodeDataResponseBody body;

    public static DescribeLiveDomainStreamTranscodeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainStreamTranscodeDataResponse self = new DescribeLiveDomainStreamTranscodeDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainStreamTranscodeDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainStreamTranscodeDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveDomainStreamTranscodeDataResponse setBody(DescribeLiveDomainStreamTranscodeDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainStreamTranscodeDataResponseBody getBody() {
        return this.body;
    }

}
