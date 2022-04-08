// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsRouteEntryListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEnsRouteEntryListResponseBody body;

    public static DescribeEnsRouteEntryListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsRouteEntryListResponse self = new DescribeEnsRouteEntryListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnsRouteEntryListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEnsRouteEntryListResponse setBody(DescribeEnsRouteEntryListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnsRouteEntryListResponseBody getBody() {
        return this.body;
    }

}
