// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeDdosCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDdosCountResponseBody body;

    public static DescribeDdosCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosCountResponse self = new DescribeDdosCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDdosCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDdosCountResponse setBody(DescribeDdosCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDdosCountResponseBody getBody() {
        return this.body;
    }

}
