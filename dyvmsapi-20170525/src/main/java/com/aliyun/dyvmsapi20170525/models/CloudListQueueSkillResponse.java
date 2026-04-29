// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListQueueSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudListQueueSkillResponseBody body;

    public static CloudListQueueSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudListQueueSkillResponse self = new CloudListQueueSkillResponse();
        return TeaModel.build(map, self);
    }

    public CloudListQueueSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudListQueueSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudListQueueSkillResponse setBody(CloudListQueueSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudListQueueSkillResponseBody getBody() {
        return this.body;
    }

}
