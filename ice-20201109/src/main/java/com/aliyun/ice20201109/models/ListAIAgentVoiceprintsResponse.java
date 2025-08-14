// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAIAgentVoiceprintsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAIAgentVoiceprintsResponseBody body;

    public static ListAIAgentVoiceprintsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAIAgentVoiceprintsResponse self = new ListAIAgentVoiceprintsResponse();
        return TeaModel.build(map, self);
    }

    public ListAIAgentVoiceprintsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAIAgentVoiceprintsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAIAgentVoiceprintsResponse setBody(ListAIAgentVoiceprintsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAIAgentVoiceprintsResponseBody getBody() {
        return this.body;
    }

}
