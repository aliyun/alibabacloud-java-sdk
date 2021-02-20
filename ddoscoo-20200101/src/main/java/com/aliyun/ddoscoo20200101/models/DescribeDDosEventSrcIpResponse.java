// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventSrcIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDDosEventSrcIpResponseBody body;

    public static DescribeDDosEventSrcIpResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDosEventSrcIpResponse self = new DescribeDDosEventSrcIpResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDDosEventSrcIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDDosEventSrcIpResponse setBody(DescribeDDosEventSrcIpResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDDosEventSrcIpResponseBody getBody() {
        return this.body;
    }

}
