// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsRouteEntryListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeEnsRouteEntryListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEnsRouteEntryListResponse setBody(DescribeEnsRouteEntryListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnsRouteEntryListResponseBody getBody() {
        return this.body;
    }

}
