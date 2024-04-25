// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeLensMonitorDisksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLensMonitorDisksResponseBody body;

    public static DescribeLensMonitorDisksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLensMonitorDisksResponse self = new DescribeLensMonitorDisksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLensMonitorDisksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLensMonitorDisksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLensMonitorDisksResponse setBody(DescribeLensMonitorDisksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLensMonitorDisksResponseBody getBody() {
        return this.body;
    }

}
