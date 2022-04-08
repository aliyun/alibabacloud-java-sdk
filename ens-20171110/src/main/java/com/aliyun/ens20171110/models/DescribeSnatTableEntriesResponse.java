// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSnatTableEntriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public DescribeSnatTableEntriesResponse setBody(DescribeSnatTableEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSnatTableEntriesResponseBody getBody() {
        return this.body;
    }

}
