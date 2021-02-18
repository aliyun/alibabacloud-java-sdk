// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDTSIPResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDTSIPResponseBody body;

    public static DescribeDTSIPResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDTSIPResponse self = new DescribeDTSIPResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDTSIPResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDTSIPResponse setBody(DescribeDTSIPResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDTSIPResponseBody getBody() {
        return this.body;
    }

}
