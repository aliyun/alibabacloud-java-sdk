// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosAllEventListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDDosAllEventListResponseBody body;

    public static DescribeDDosAllEventListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDosAllEventListResponse self = new DescribeDDosAllEventListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDDosAllEventListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDDosAllEventListResponse setBody(DescribeDDosAllEventListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDDosAllEventListResponseBody getBody() {
        return this.body;
    }

}
