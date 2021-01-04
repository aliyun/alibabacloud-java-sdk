// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAccessGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAccessGroupsResponseBody body;

    public static DescribeAccessGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessGroupsResponse self = new DescribeAccessGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccessGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccessGroupsResponse setBody(DescribeAccessGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccessGroupsResponseBody getBody() {
        return this.body;
    }

}
