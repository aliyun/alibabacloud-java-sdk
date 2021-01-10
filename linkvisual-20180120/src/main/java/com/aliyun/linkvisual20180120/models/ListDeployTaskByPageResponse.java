// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class ListDeployTaskByPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDeployTaskByPageResponseBody body;

    public static ListDeployTaskByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeployTaskByPageResponse self = new ListDeployTaskByPageResponse();
        return TeaModel.build(map, self);
    }

    public ListDeployTaskByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeployTaskByPageResponse setBody(ListDeployTaskByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeployTaskByPageResponseBody getBody() {
        return this.body;
    }

}
