// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListModuleModelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListModuleModelsResponseBody body;

    public static ListModuleModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModuleModelsResponse self = new ListModuleModelsResponse();
        return TeaModel.build(map, self);
    }

    public ListModuleModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModuleModelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModuleModelsResponse setBody(ListModuleModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModuleModelsResponseBody getBody() {
        return this.body;
    }

}
