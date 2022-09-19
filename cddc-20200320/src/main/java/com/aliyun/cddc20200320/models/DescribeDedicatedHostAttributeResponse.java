// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDedicatedHostAttributeResponseBody body;

    public static DescribeDedicatedHostAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostAttributeResponse self = new DescribeDedicatedHostAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDedicatedHostAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDedicatedHostAttributeResponse setBody(DescribeDedicatedHostAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDedicatedHostAttributeResponseBody getBody() {
        return this.body;
    }

}
