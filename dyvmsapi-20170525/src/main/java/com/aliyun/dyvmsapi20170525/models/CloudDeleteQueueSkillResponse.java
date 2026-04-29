// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudDeleteQueueSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudDeleteQueueSkillResponseBody body;

    public static CloudDeleteQueueSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudDeleteQueueSkillResponse self = new CloudDeleteQueueSkillResponse();
        return TeaModel.build(map, self);
    }

    public CloudDeleteQueueSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudDeleteQueueSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudDeleteQueueSkillResponse setBody(CloudDeleteQueueSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudDeleteQueueSkillResponseBody getBody() {
        return this.body;
    }

}
