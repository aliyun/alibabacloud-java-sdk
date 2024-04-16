// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListModulesByPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListModulesByPageResponseBody body;

    public static ListModulesByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModulesByPageResponse self = new ListModulesByPageResponse();
        return TeaModel.build(map, self);
    }

    public ListModulesByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModulesByPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModulesByPageResponse setBody(ListModulesByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModulesByPageResponseBody getBody() {
        return this.body;
    }

}
