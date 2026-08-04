// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterListDeptMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterListDeptMembersResponseBody body;

    public static ModelRouterListDeptMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterListDeptMembersResponse self = new ModelRouterListDeptMembersResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterListDeptMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterListDeptMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterListDeptMembersResponse setBody(ModelRouterListDeptMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterListDeptMembersResponseBody getBody() {
        return this.body;
    }

}
