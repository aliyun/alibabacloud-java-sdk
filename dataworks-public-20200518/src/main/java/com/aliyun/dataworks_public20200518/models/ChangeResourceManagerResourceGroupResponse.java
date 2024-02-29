// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ChangeResourceManagerResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeResourceManagerResourceGroupResponseBody body;

    public static ChangeResourceManagerResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeResourceManagerResourceGroupResponse self = new ChangeResourceManagerResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public ChangeResourceManagerResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeResourceManagerResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeResourceManagerResourceGroupResponse setBody(ChangeResourceManagerResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeResourceManagerResourceGroupResponseBody getBody() {
        return this.body;
    }

}
