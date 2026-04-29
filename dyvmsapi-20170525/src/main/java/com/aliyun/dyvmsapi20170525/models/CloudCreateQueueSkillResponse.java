// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudCreateQueueSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudCreateQueueSkillResponseBody body;

    public static CloudCreateQueueSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudCreateQueueSkillResponse self = new CloudCreateQueueSkillResponse();
        return TeaModel.build(map, self);
    }

    public CloudCreateQueueSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudCreateQueueSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudCreateQueueSkillResponse setBody(CloudCreateQueueSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudCreateQueueSkillResponseBody getBody() {
        return this.body;
    }

}
