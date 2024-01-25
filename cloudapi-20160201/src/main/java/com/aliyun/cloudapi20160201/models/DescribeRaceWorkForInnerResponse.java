// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeRaceWorkForInnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRaceWorkForInnerResponseBody body;

    public static DescribeRaceWorkForInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRaceWorkForInnerResponse self = new DescribeRaceWorkForInnerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRaceWorkForInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRaceWorkForInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRaceWorkForInnerResponse setBody(DescribeRaceWorkForInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRaceWorkForInnerResponseBody getBody() {
        return this.body;
    }

}
