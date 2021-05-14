// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsSlowSqlsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDrdsSlowSqlsResponseBody body;

    public static DescribeDrdsSlowSqlsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsSlowSqlsResponse self = new DescribeDrdsSlowSqlsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsSlowSqlsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrdsSlowSqlsResponse setBody(DescribeDrdsSlowSqlsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrdsSlowSqlsResponseBody getBody() {
        return this.body;
    }

}
