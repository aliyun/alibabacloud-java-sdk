// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeDirQuotasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDirQuotasResponseBody body;

    public static DescribeDirQuotasResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDirQuotasResponse self = new DescribeDirQuotasResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDirQuotasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDirQuotasResponse setBody(DescribeDirQuotasResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDirQuotasResponseBody getBody() {
        return this.body;
    }

}
