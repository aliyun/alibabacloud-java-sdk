// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeRequestStatisticCountByEsnBiz1DayProvinceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRequestStatisticCountByEsnBiz1DayProvinceResponseBody body;

    public static DescribeRequestStatisticCountByEsnBiz1DayProvinceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRequestStatisticCountByEsnBiz1DayProvinceResponse self = new DescribeRequestStatisticCountByEsnBiz1DayProvinceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRequestStatisticCountByEsnBiz1DayProvinceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRequestStatisticCountByEsnBiz1DayProvinceResponse setBody(DescribeRequestStatisticCountByEsnBiz1DayProvinceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRequestStatisticCountByEsnBiz1DayProvinceResponseBody getBody() {
        return this.body;
    }

}
