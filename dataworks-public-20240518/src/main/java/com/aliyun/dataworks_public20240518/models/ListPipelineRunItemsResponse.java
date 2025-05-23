// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListPipelineRunItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPipelineRunItemsResponseBody body;

    public static ListPipelineRunItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineRunItemsResponse self = new ListPipelineRunItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListPipelineRunItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPipelineRunItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPipelineRunItemsResponse setBody(ListPipelineRunItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPipelineRunItemsResponseBody getBody() {
        return this.body;
    }

}
