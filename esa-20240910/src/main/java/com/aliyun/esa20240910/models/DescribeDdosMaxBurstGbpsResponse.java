// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeDdosMaxBurstGbpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDdosMaxBurstGbpsResponseBody body;

    public static DescribeDdosMaxBurstGbpsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosMaxBurstGbpsResponse self = new DescribeDdosMaxBurstGbpsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDdosMaxBurstGbpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDdosMaxBurstGbpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDdosMaxBurstGbpsResponse setBody(DescribeDdosMaxBurstGbpsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDdosMaxBurstGbpsResponseBody getBody() {
        return this.body;
    }

}
