// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BuildAICoachScriptRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BuildAICoachScriptRecordResponseBody body;

    public static BuildAICoachScriptRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        BuildAICoachScriptRecordResponse self = new BuildAICoachScriptRecordResponse();
        return TeaModel.build(map, self);
    }

    public BuildAICoachScriptRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BuildAICoachScriptRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BuildAICoachScriptRecordResponse setBody(BuildAICoachScriptRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public BuildAICoachScriptRecordResponseBody getBody() {
        return this.body;
    }

}
