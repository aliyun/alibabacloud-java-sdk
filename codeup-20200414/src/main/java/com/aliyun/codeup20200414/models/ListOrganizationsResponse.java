// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListOrganizationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOrganizationsResponseBody body;

    public static ListOrganizationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationsResponse self = new ListOrganizationsResponse();
        return TeaModel.build(map, self);
    }

    public ListOrganizationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOrganizationsResponse setBody(ListOrganizationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOrganizationsResponseBody getBody() {
        return this.body;
    }

}
