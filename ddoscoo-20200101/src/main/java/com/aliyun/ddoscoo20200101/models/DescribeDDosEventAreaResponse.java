// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventAreaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDDosEventAreaResponseBody body;

    public static DescribeDDosEventAreaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDosEventAreaResponse self = new DescribeDDosEventAreaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDDosEventAreaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDDosEventAreaResponse setBody(DescribeDDosEventAreaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDDosEventAreaResponseBody getBody() {
        return this.body;
    }

}
