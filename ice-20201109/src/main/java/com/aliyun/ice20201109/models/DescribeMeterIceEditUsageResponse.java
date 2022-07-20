// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterIceEditUsageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMeterIceEditUsageResponseBody body;

    public static DescribeMeterIceEditUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterIceEditUsageResponse self = new DescribeMeterIceEditUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterIceEditUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterIceEditUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeterIceEditUsageResponse setBody(DescribeMeterIceEditUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterIceEditUsageResponseBody getBody() {
        return this.body;
    }

}
