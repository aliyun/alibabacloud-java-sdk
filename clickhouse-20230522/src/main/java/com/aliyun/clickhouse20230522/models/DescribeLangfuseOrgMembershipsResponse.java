// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeLangfuseOrgMembershipsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLangfuseOrgMembershipsResponseBody body;

    public static DescribeLangfuseOrgMembershipsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLangfuseOrgMembershipsResponse self = new DescribeLangfuseOrgMembershipsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLangfuseOrgMembershipsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLangfuseOrgMembershipsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLangfuseOrgMembershipsResponse setBody(DescribeLangfuseOrgMembershipsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLangfuseOrgMembershipsResponseBody getBody() {
        return this.body;
    }

}
