// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListFlowTagGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFlowTagGroupsResponseBody body;

    public static ListFlowTagGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowTagGroupsResponse self = new ListFlowTagGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowTagGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowTagGroupsResponse setBody(ListFlowTagGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowTagGroupsResponseBody getBody() {
        return this.body;
    }

}
