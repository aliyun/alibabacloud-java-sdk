// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeLangfuseProjectMembershipsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLangfuseProjectMembershipsResponseBody body;

    public static DescribeLangfuseProjectMembershipsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLangfuseProjectMembershipsResponse self = new DescribeLangfuseProjectMembershipsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLangfuseProjectMembershipsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLangfuseProjectMembershipsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLangfuseProjectMembershipsResponse setBody(DescribeLangfuseProjectMembershipsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLangfuseProjectMembershipsResponseBody getBody() {
        return this.body;
    }

}
