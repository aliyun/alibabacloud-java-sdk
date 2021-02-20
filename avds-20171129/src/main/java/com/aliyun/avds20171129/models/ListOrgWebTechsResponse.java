// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListOrgWebTechsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOrgWebTechsResponseBody body;

    public static ListOrgWebTechsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOrgWebTechsResponse self = new ListOrgWebTechsResponse();
        return TeaModel.build(map, self);
    }

    public ListOrgWebTechsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOrgWebTechsResponse setBody(ListOrgWebTechsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOrgWebTechsResponseBody getBody() {
        return this.body;
    }

}
