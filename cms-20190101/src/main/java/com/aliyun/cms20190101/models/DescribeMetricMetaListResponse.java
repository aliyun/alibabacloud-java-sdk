// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricMetaListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMetricMetaListResponseBody body;

    public static DescribeMetricMetaListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricMetaListResponse self = new DescribeMetricMetaListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMetricMetaListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMetricMetaListResponse setBody(DescribeMetricMetaListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMetricMetaListResponseBody getBody() {
        return this.body;
    }

}
