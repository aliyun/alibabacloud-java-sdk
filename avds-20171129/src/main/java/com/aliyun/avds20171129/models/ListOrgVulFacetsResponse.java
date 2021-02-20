// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListOrgVulFacetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOrgVulFacetsResponseBody body;

    public static ListOrgVulFacetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOrgVulFacetsResponse self = new ListOrgVulFacetsResponse();
        return TeaModel.build(map, self);
    }

    public ListOrgVulFacetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOrgVulFacetsResponse setBody(ListOrgVulFacetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOrgVulFacetsResponseBody getBody() {
        return this.body;
    }

}
