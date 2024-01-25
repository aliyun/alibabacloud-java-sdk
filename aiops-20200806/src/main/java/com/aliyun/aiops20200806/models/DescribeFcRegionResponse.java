// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeFcRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFcRegionResponseBody body;

    public static DescribeFcRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFcRegionResponse self = new DescribeFcRegionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFcRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFcRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFcRegionResponse setBody(DescribeFcRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFcRegionResponseBody getBody() {
        return this.body;
    }

}
