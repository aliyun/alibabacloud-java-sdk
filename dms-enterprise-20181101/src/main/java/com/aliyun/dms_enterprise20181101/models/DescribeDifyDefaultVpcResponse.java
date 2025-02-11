// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DescribeDifyDefaultVpcResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDifyDefaultVpcResponseBody body;

    public static DescribeDifyDefaultVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDifyDefaultVpcResponse self = new DescribeDifyDefaultVpcResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDifyDefaultVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDifyDefaultVpcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDifyDefaultVpcResponse setBody(DescribeDifyDefaultVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDifyDefaultVpcResponseBody getBody() {
        return this.body;
    }

}
