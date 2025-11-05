// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListResourceGroupAssociateProjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResourceGroupAssociateProjectsResponseBody body;

    public static ListResourceGroupAssociateProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupAssociateProjectsResponse self = new ListResourceGroupAssociateProjectsResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupAssociateProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceGroupAssociateProjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourceGroupAssociateProjectsResponse setBody(ListResourceGroupAssociateProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceGroupAssociateProjectsResponseBody getBody() {
        return this.body;
    }

}
