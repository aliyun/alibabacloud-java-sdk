// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeContactListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeContactListResponseBody body;

    public static DescribeContactListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContactListResponse self = new DescribeContactListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContactListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContactListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeContactListResponse setBody(DescribeContactListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContactListResponseBody getBody() {
        return this.body;
    }

}
