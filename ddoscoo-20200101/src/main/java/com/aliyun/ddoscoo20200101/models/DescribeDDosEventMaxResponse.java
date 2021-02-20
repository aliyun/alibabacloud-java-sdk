// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventMaxResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDDosEventMaxResponseBody body;

    public static DescribeDDosEventMaxResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDosEventMaxResponse self = new DescribeDDosEventMaxResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDDosEventMaxResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDDosEventMaxResponse setBody(DescribeDDosEventMaxResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDDosEventMaxResponseBody getBody() {
        return this.body;
    }

}
