// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeSiteLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSiteLogsResponseBody body;

    public static DescribeSiteLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteLogsResponse self = new DescribeSiteLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSiteLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSiteLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSiteLogsResponse setBody(DescribeSiteLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSiteLogsResponseBody getBody() {
        return this.body;
    }

}
