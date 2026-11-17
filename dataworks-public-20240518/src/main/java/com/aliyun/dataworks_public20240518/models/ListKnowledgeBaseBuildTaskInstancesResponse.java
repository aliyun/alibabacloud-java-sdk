// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListKnowledgeBaseBuildTaskInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKnowledgeBaseBuildTaskInstancesResponseBody body;

    public static ListKnowledgeBaseBuildTaskInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeBaseBuildTaskInstancesResponse self = new ListKnowledgeBaseBuildTaskInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeBaseBuildTaskInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKnowledgeBaseBuildTaskInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKnowledgeBaseBuildTaskInstancesResponse setBody(ListKnowledgeBaseBuildTaskInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKnowledgeBaseBuildTaskInstancesResponseBody getBody() {
        return this.body;
    }

}
