// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeIdentifyRecordListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeIdentifyRecordListResponseBody body;

    public static DescribeIdentifyRecordListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIdentifyRecordListResponse self = new DescribeIdentifyRecordListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIdentifyRecordListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIdentifyRecordListResponse setBody(DescribeIdentifyRecordListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIdentifyRecordListResponseBody getBody() {
        return this.body;
    }

}
