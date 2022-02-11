// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDtsEtlJobVersionInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDtsEtlJobVersionInfoResponseBody body;

    public static DescribeDtsEtlJobVersionInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDtsEtlJobVersionInfoResponse self = new DescribeDtsEtlJobVersionInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDtsEtlJobVersionInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDtsEtlJobVersionInfoResponse setBody(DescribeDtsEtlJobVersionInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDtsEtlJobVersionInfoResponseBody getBody() {
        return this.body;
    }

}
