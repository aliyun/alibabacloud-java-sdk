// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class OfflineSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OfflineSkillResponseBody body;

    public static OfflineSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        OfflineSkillResponse self = new OfflineSkillResponse();
        return TeaModel.build(map, self);
    }

    public OfflineSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OfflineSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OfflineSkillResponse setBody(OfflineSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public OfflineSkillResponseBody getBody() {
        return this.body;
    }

}
