// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListAppReleaseStageExecutionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppReleaseStageExecutionsResponseBody body;

    public static ListAppReleaseStageExecutionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppReleaseStageExecutionsResponse self = new ListAppReleaseStageExecutionsResponse();
        return TeaModel.build(map, self);
    }

    public ListAppReleaseStageExecutionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppReleaseStageExecutionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppReleaseStageExecutionsResponse setBody(ListAppReleaseStageExecutionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppReleaseStageExecutionsResponseBody getBody() {
        return this.body;
    }

}
