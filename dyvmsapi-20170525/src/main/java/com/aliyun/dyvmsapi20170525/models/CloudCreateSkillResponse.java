// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudCreateSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudCreateSkillResponseBody body;

    public static CloudCreateSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudCreateSkillResponse self = new CloudCreateSkillResponse();
        return TeaModel.build(map, self);
    }

    public CloudCreateSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudCreateSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudCreateSkillResponse setBody(CloudCreateSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudCreateSkillResponseBody getBody() {
        return this.body;
    }

}
