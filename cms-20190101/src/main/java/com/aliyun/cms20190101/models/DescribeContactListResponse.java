// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeContactListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeContactListResponse setBody(DescribeContactListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContactListResponseBody getBody() {
        return this.body;
    }

}
