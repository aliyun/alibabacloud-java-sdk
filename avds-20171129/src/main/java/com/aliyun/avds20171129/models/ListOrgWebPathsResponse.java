// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListOrgWebPathsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOrgWebPathsResponseBody body;

    public static ListOrgWebPathsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOrgWebPathsResponse self = new ListOrgWebPathsResponse();
        return TeaModel.build(map, self);
    }

    public ListOrgWebPathsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOrgWebPathsResponse setBody(ListOrgWebPathsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOrgWebPathsResponseBody getBody() {
        return this.body;
    }

}
