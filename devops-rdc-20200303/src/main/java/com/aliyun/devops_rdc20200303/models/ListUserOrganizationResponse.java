// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListUserOrganizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserOrganizationResponseBody body;

    public static ListUserOrganizationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserOrganizationResponse self = new ListUserOrganizationResponse();
        return TeaModel.build(map, self);
    }

    public ListUserOrganizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserOrganizationResponse setBody(ListUserOrganizationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserOrganizationResponseBody getBody() {
        return this.body;
    }

}
