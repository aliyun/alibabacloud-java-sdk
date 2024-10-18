// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class AssociateProjectToResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateProjectToResourceGroupResponseBody body;

    public static AssociateProjectToResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateProjectToResourceGroupResponse self = new AssociateProjectToResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public AssociateProjectToResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateProjectToResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateProjectToResourceGroupResponse setBody(AssociateProjectToResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateProjectToResourceGroupResponseBody getBody() {
        return this.body;
    }

}
