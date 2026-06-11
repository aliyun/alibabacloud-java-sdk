// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class UploadSkillViaOssResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadSkillViaOssResponseBody body;

    public static UploadSkillViaOssResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadSkillViaOssResponse self = new UploadSkillViaOssResponse();
        return TeaModel.build(map, self);
    }

    public UploadSkillViaOssResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadSkillViaOssResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadSkillViaOssResponse setBody(UploadSkillViaOssResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadSkillViaOssResponseBody getBody() {
        return this.body;
    }

}
