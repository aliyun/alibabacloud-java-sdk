// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class ModifyTopicRemarkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTopicRemarkResponseBody body;

    public static ModifyTopicRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTopicRemarkResponse self = new ModifyTopicRemarkResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTopicRemarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTopicRemarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTopicRemarkResponse setBody(ModifyTopicRemarkResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTopicRemarkResponseBody getBody() {
        return this.body;
    }

}
