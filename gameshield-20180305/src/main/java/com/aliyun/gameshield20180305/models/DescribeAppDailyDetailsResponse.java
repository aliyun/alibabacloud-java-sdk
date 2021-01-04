// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeAppDailyDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppDailyDetailsResponseBody body;

    public static DescribeAppDailyDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppDailyDetailsResponse self = new DescribeAppDailyDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppDailyDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppDailyDetailsResponse setBody(DescribeAppDailyDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppDailyDetailsResponseBody getBody() {
        return this.body;
    }

}
