// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeDasOpsConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDasOpsConfigResponseBody body;

    public static DescribeDasOpsConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDasOpsConfigResponse self = new DescribeDasOpsConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDasOpsConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDasOpsConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDasOpsConfigResponse setBody(DescribeDasOpsConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDasOpsConfigResponseBody getBody() {
        return this.body;
    }

}
