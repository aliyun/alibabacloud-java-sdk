// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DescribeDifyEditionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDifyEditionsResponseBody body;

    public static DescribeDifyEditionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDifyEditionsResponse self = new DescribeDifyEditionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDifyEditionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDifyEditionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDifyEditionsResponse setBody(DescribeDifyEditionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDifyEditionsResponseBody getBody() {
        return this.body;
    }

}
