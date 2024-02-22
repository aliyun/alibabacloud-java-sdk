// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSystemEventMetaListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSystemEventMetaListResponseBody body;

    public static DescribeSystemEventMetaListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemEventMetaListResponse self = new DescribeSystemEventMetaListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSystemEventMetaListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSystemEventMetaListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSystemEventMetaListResponse setBody(DescribeSystemEventMetaListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSystemEventMetaListResponseBody getBody() {
        return this.body;
    }

}
