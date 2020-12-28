// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class ModifyTopicRemarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyTopicRemarkResponse setBody(ModifyTopicRemarkResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTopicRemarkResponseBody getBody() {
        return this.body;
    }

}
