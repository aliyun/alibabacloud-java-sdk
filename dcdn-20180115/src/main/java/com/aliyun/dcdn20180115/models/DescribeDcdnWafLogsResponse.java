// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnWafLogsResponseBody body;

    public static DescribeDcdnWafLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafLogsResponse self = new DescribeDcdnWafLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnWafLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnWafLogsResponse setBody(DescribeDcdnWafLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnWafLogsResponseBody getBody() {
        return this.body;
    }

}
