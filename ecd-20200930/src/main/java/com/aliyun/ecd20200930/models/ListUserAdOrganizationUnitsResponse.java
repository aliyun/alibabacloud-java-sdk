// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListUserAdOrganizationUnitsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserAdOrganizationUnitsResponseBody body;

    public static ListUserAdOrganizationUnitsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserAdOrganizationUnitsResponse self = new ListUserAdOrganizationUnitsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserAdOrganizationUnitsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserAdOrganizationUnitsResponse setBody(ListUserAdOrganizationUnitsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserAdOrganizationUnitsResponseBody getBody() {
        return this.body;
    }

}
