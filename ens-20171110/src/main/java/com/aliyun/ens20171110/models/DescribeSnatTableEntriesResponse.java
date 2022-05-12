// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSnatTableEntriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSnatTableEntriesResponseBody body;

    public static DescribeSnatTableEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnatTableEntriesResponse self = new DescribeSnatTableEntriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSnatTableEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSnatTableEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSnatTableEntriesResponse setBody(DescribeSnatTableEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSnatTableEntriesResponseBody getBody() {
        return this.body;
    }

}
