// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class PrecheckSkillUploadViaOssResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PrecheckSkillUploadViaOssResponseBody body;

    public static PrecheckSkillUploadViaOssResponse build(java.util.Map<String, ?> map) throws Exception {
        PrecheckSkillUploadViaOssResponse self = new PrecheckSkillUploadViaOssResponse();
        return TeaModel.build(map, self);
    }

    public PrecheckSkillUploadViaOssResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PrecheckSkillUploadViaOssResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PrecheckSkillUploadViaOssResponse setBody(PrecheckSkillUploadViaOssResponseBody body) {
        this.body = body;
        return this;
    }
    public PrecheckSkillUploadViaOssResponseBody getBody() {
        return this.body;
    }

}
