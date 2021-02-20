// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventIspResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDDosEventIspResponseBody body;

    public static DescribeDDosEventIspResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDosEventIspResponse self = new DescribeDDosEventIspResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDDosEventIspResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDDosEventIspResponse setBody(DescribeDDosEventIspResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDDosEventIspResponseBody getBody() {
        return this.body;
    }

}
