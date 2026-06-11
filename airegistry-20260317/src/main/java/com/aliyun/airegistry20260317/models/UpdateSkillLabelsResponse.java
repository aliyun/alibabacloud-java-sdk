// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class UpdateSkillLabelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSkillLabelsResponseBody body;

    public static UpdateSkillLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillLabelsResponse self = new UpdateSkillLabelsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSkillLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSkillLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSkillLabelsResponse setBody(UpdateSkillLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSkillLabelsResponseBody getBody() {
        return this.body;
    }

}
