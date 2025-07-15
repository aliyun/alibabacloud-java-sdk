// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveCdnDiagnoseInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveCdnDiagnoseInfoResponseBody body;

    public static DescribeLiveCdnDiagnoseInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveCdnDiagnoseInfoResponse self = new DescribeLiveCdnDiagnoseInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveCdnDiagnoseInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveCdnDiagnoseInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveCdnDiagnoseInfoResponse setBody(DescribeLiveCdnDiagnoseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveCdnDiagnoseInfoResponseBody getBody() {
        return this.body;
    }

}
