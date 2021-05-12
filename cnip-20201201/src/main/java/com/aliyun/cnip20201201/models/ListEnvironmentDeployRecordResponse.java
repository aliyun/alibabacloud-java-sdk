// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvironmentDeployRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEnvironmentDeployRecordResponseBody body;

    public static ListEnvironmentDeployRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentDeployRecordResponse self = new ListEnvironmentDeployRecordResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentDeployRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvironmentDeployRecordResponse setBody(ListEnvironmentDeployRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvironmentDeployRecordResponseBody getBody() {
        return this.body;
    }

}
