// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListArtifactRisksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListArtifactRisksResponseBody body;

    public static ListArtifactRisksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListArtifactRisksResponse self = new ListArtifactRisksResponse();
        return TeaModel.build(map, self);
    }

    public ListArtifactRisksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListArtifactRisksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListArtifactRisksResponse setBody(ListArtifactRisksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListArtifactRisksResponseBody getBody() {
        return this.body;
    }

}
