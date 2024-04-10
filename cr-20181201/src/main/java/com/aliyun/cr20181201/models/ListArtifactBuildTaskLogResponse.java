// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListArtifactBuildTaskLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListArtifactBuildTaskLogResponseBody body;

    public static ListArtifactBuildTaskLogResponse build(java.util.Map<String, ?> map) throws Exception {
        ListArtifactBuildTaskLogResponse self = new ListArtifactBuildTaskLogResponse();
        return TeaModel.build(map, self);
    }

    public ListArtifactBuildTaskLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListArtifactBuildTaskLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListArtifactBuildTaskLogResponse setBody(ListArtifactBuildTaskLogResponseBody body) {
        this.body = body;
        return this;
    }
    public ListArtifactBuildTaskLogResponseBody getBody() {
        return this.body;
    }

}
