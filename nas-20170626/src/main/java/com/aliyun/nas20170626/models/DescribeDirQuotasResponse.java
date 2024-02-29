// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeDirQuotasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeDirQuotasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDirQuotasResponse setBody(DescribeDirQuotasResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDirQuotasResponseBody getBody() {
        return this.body;
    }

}
