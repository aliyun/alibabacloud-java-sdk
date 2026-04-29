// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudDeleteSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudDeleteSkillResponseBody body;

    public static CloudDeleteSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudDeleteSkillResponse self = new CloudDeleteSkillResponse();
        return TeaModel.build(map, self);
    }

    public CloudDeleteSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudDeleteSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudDeleteSkillResponse setBody(CloudDeleteSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudDeleteSkillResponseBody getBody() {
        return this.body;
    }

}
