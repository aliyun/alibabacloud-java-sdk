// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudListSkillResponseBody body;

    public static CloudListSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudListSkillResponse self = new CloudListSkillResponse();
        return TeaModel.build(map, self);
    }

    public CloudListSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudListSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudListSkillResponse setBody(CloudListSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudListSkillResponseBody getBody() {
        return this.body;
    }

}
