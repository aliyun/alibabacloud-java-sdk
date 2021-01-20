// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeContactGroupListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeContactGroupListResponseBody body;

    public static DescribeContactGroupListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContactGroupListResponse self = new DescribeContactGroupListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContactGroupListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContactGroupListResponse setBody(DescribeContactGroupListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContactGroupListResponseBody getBody() {
        return this.body;
    }

}
