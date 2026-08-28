// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class BatchUploadSkillsViaOssResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchUploadSkillsViaOssResponseBody body;

    public static BatchUploadSkillsViaOssResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUploadSkillsViaOssResponse self = new BatchUploadSkillsViaOssResponse();
        return TeaModel.build(map, self);
    }

    public BatchUploadSkillsViaOssResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUploadSkillsViaOssResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchUploadSkillsViaOssResponse setBody(BatchUploadSkillsViaOssResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUploadSkillsViaOssResponseBody getBody() {
        return this.body;
    }

}
