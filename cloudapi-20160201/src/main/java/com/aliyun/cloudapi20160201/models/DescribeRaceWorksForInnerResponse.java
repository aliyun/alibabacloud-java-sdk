// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeRaceWorksForInnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRaceWorksForInnerResponseBody body;

    public static DescribeRaceWorksForInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRaceWorksForInnerResponse self = new DescribeRaceWorksForInnerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRaceWorksForInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRaceWorksForInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRaceWorksForInnerResponse setBody(DescribeRaceWorksForInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRaceWorksForInnerResponseBody getBody() {
        return this.body;
    }

}
