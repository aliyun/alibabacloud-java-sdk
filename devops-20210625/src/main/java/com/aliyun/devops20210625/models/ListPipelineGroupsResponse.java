// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListPipelineGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPipelineGroupsResponseBody body;

    public static ListPipelineGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineGroupsResponse self = new ListPipelineGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListPipelineGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPipelineGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPipelineGroupsResponse setBody(ListPipelineGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPipelineGroupsResponseBody getBody() {
        return this.body;
    }

}
