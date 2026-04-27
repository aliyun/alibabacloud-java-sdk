// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudQueryAgentSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudQueryAgentSkillResponseBody body;

    public static CloudQueryAgentSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudQueryAgentSkillResponse self = new CloudQueryAgentSkillResponse();
        return TeaModel.build(map, self);
    }

    public CloudQueryAgentSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudQueryAgentSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudQueryAgentSkillResponse setBody(CloudQueryAgentSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudQueryAgentSkillResponseBody getBody() {
        return this.body;
    }

}
