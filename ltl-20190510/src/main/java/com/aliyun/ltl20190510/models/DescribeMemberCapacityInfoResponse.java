// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class DescribeMemberCapacityInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMemberCapacityInfoResponseBody body;

    public static DescribeMemberCapacityInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMemberCapacityInfoResponse self = new DescribeMemberCapacityInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMemberCapacityInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMemberCapacityInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMemberCapacityInfoResponse setBody(DescribeMemberCapacityInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMemberCapacityInfoResponseBody getBody() {
        return this.body;
    }

}
