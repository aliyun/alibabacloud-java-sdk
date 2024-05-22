// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class DescribePlanogramRailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePlanogramRailsResponseBody body;

    public static DescribePlanogramRailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePlanogramRailsResponse self = new DescribePlanogramRailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePlanogramRailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePlanogramRailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePlanogramRailsResponse setBody(DescribePlanogramRailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePlanogramRailsResponseBody getBody() {
        return this.body;
    }

}
