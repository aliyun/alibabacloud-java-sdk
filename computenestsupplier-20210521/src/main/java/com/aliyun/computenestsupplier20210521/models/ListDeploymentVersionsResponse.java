// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListDeploymentVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDeploymentVersionsResponseBody body;

    public static ListDeploymentVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentVersionsResponse self = new ListDeploymentVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListDeploymentVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeploymentVersionsResponse setBody(ListDeploymentVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeploymentVersionsResponseBody getBody() {
        return this.body;
    }

}
