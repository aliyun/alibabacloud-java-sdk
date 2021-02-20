// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class AddOrgWebPathsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddOrgWebPathsResponseBody body;

    public static AddOrgWebPathsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddOrgWebPathsResponse self = new AddOrgWebPathsResponse();
        return TeaModel.build(map, self);
    }

    public AddOrgWebPathsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddOrgWebPathsResponse setBody(AddOrgWebPathsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddOrgWebPathsResponseBody getBody() {
        return this.body;
    }

}
