// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListFlowTagGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListFlowTagGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFlowTagGroupsResponse setBody(ListFlowTagGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowTagGroupsResponseBody getBody() {
        return this.body;
    }

}
