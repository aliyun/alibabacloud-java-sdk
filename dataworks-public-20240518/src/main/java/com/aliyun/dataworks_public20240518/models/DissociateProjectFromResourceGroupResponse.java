// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DissociateProjectFromResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DissociateProjectFromResourceGroupResponseBody body;

    public static DissociateProjectFromResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DissociateProjectFromResourceGroupResponse self = new DissociateProjectFromResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public DissociateProjectFromResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DissociateProjectFromResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DissociateProjectFromResourceGroupResponse setBody(DissociateProjectFromResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DissociateProjectFromResourceGroupResponseBody getBody() {
        return this.body;
    }

}
