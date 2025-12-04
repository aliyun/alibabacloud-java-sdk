// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunTopicSelectionMergeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunTopicSelectionMergeResponseBody body;

    public static RunTopicSelectionMergeResponse build(java.util.Map<String, ?> map) throws Exception {
        RunTopicSelectionMergeResponse self = new RunTopicSelectionMergeResponse();
        return TeaModel.build(map, self);
    }

    public RunTopicSelectionMergeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunTopicSelectionMergeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunTopicSelectionMergeResponse setBody(RunTopicSelectionMergeResponseBody body) {
        this.body = body;
        return this;
    }
    public RunTopicSelectionMergeResponseBody getBody() {
        return this.body;
    }

}
