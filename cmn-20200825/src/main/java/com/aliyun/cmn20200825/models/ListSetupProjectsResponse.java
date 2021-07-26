// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListSetupProjectsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSetupProjectsResponseBody body;

    public static ListSetupProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSetupProjectsResponse self = new ListSetupProjectsResponse();
        return TeaModel.build(map, self);
    }

    public ListSetupProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSetupProjectsResponse setBody(ListSetupProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSetupProjectsResponseBody getBody() {
        return this.body;
    }

}
