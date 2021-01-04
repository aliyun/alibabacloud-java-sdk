// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeDailyDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDailyDetailsResponseBody body;

    public static DescribeDailyDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDailyDetailsResponse self = new DescribeDailyDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDailyDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDailyDetailsResponse setBody(DescribeDailyDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDailyDetailsResponseBody getBody() {
        return this.body;
    }

}
