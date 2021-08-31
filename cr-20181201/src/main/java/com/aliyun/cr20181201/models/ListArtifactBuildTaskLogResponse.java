// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListArtifactBuildTaskLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListArtifactBuildTaskLogResponse setBody(ListArtifactBuildTaskLogResponseBody body) {
        this.body = body;
        return this;
    }
    public ListArtifactBuildTaskLogResponseBody getBody() {
        return this.body;
    }

}
