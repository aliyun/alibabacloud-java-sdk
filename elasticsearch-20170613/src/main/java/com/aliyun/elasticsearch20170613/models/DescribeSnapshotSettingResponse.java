// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeSnapshotSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSnapshotSettingResponseBody body;

    public static DescribeSnapshotSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotSettingResponse self = new DescribeSnapshotSettingResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSnapshotSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSnapshotSettingResponse setBody(DescribeSnapshotSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSnapshotSettingResponseBody getBody() {
        return this.body;
    }

}
