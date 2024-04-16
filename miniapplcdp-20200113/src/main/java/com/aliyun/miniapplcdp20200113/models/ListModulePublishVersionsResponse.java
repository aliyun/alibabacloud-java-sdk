// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListModulePublishVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListModulePublishVersionsResponseBody body;

    public static ListModulePublishVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModulePublishVersionsResponse self = new ListModulePublishVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListModulePublishVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModulePublishVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModulePublishVersionsResponse setBody(ListModulePublishVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModulePublishVersionsResponseBody getBody() {
        return this.body;
    }

}
