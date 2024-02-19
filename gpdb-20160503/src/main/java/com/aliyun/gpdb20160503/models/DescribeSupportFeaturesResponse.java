// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSupportFeaturesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSupportFeaturesResponseBody body;

    public static DescribeSupportFeaturesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupportFeaturesResponse self = new DescribeSupportFeaturesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSupportFeaturesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSupportFeaturesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSupportFeaturesResponse setBody(DescribeSupportFeaturesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSupportFeaturesResponseBody getBody() {
        return this.body;
    }

}
