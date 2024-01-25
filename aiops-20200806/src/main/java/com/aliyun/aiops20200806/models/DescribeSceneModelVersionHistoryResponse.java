// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeSceneModelVersionHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSceneModelVersionHistoryResponseBody body;

    public static DescribeSceneModelVersionHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneModelVersionHistoryResponse self = new DescribeSceneModelVersionHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSceneModelVersionHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSceneModelVersionHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSceneModelVersionHistoryResponse setBody(DescribeSceneModelVersionHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSceneModelVersionHistoryResponseBody getBody() {
        return this.body;
    }

}
