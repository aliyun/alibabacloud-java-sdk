// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCrossProjectPipelineRunItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCrossProjectPipelineRunItemsResponseBody body;

    public static ListCrossProjectPipelineRunItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCrossProjectPipelineRunItemsResponse self = new ListCrossProjectPipelineRunItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListCrossProjectPipelineRunItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCrossProjectPipelineRunItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCrossProjectPipelineRunItemsResponse setBody(ListCrossProjectPipelineRunItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCrossProjectPipelineRunItemsResponseBody getBody() {
        return this.body;
    }

}
