// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListUserOrganizationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserOrganizationsResponseBody body;

    public static ListUserOrganizationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserOrganizationsResponse self = new ListUserOrganizationsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserOrganizationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserOrganizationsResponse setBody(ListUserOrganizationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserOrganizationsResponseBody getBody() {
        return this.body;
    }

}
