// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListVariableGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListVariableGroupsResponseBody body;

    public static ListVariableGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVariableGroupsResponse self = new ListVariableGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListVariableGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVariableGroupsResponse setBody(ListVariableGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVariableGroupsResponseBody getBody() {
        return this.body;
    }

}
