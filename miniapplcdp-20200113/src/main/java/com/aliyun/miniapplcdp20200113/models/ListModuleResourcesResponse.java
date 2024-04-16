// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListModuleResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListModuleResourcesResponseBody body;

    public static ListModuleResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModuleResourcesResponse self = new ListModuleResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListModuleResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModuleResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModuleResourcesResponse setBody(ListModuleResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModuleResourcesResponseBody getBody() {
        return this.body;
    }

}
