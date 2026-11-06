// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeDataAgentSkillDownloadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataAgentSkillDownloadResponseBody body;

    public static DescribeDataAgentSkillDownloadResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataAgentSkillDownloadResponse self = new DescribeDataAgentSkillDownloadResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataAgentSkillDownloadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataAgentSkillDownloadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataAgentSkillDownloadResponse setBody(DescribeDataAgentSkillDownloadResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataAgentSkillDownloadResponseBody getBody() {
        return this.body;
    }

}
