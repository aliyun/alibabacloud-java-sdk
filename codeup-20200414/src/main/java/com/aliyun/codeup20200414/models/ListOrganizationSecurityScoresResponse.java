// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListOrganizationSecurityScoresResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOrganizationSecurityScoresResponseBody body;

    public static ListOrganizationSecurityScoresResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationSecurityScoresResponse self = new ListOrganizationSecurityScoresResponse();
        return TeaModel.build(map, self);
    }

    public ListOrganizationSecurityScoresResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOrganizationSecurityScoresResponse setBody(ListOrganizationSecurityScoresResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOrganizationSecurityScoresResponseBody getBody() {
        return this.body;
    }

}
