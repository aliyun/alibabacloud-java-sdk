// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertFinalDataListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAlertFinalDataListResponseBody body;

    public static DescribeAlertFinalDataListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertFinalDataListResponse self = new DescribeAlertFinalDataListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertFinalDataListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertFinalDataListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlertFinalDataListResponse setBody(DescribeAlertFinalDataListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertFinalDataListResponseBody getBody() {
        return this.body;
    }

}
