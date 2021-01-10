// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainTranscodeDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveDomainTranscodeDataResponseBody body;

    public static DescribeLiveDomainTranscodeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainTranscodeDataResponse self = new DescribeLiveDomainTranscodeDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainTranscodeDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainTranscodeDataResponse setBody(DescribeLiveDomainTranscodeDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainTranscodeDataResponseBody getBody() {
        return this.body;
    }

}
