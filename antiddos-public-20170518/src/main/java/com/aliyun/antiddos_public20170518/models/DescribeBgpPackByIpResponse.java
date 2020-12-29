// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeBgpPackByIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBgpPackByIpResponseBody body;

    public static DescribeBgpPackByIpResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBgpPackByIpResponse self = new DescribeBgpPackByIpResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBgpPackByIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBgpPackByIpResponse setBody(DescribeBgpPackByIpResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBgpPackByIpResponseBody getBody() {
        return this.body;
    }

}
