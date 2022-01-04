// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListBlueprintInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListBlueprintInstancesResponseBody body;

    public static ListBlueprintInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBlueprintInstancesResponse self = new ListBlueprintInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListBlueprintInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBlueprintInstancesResponse setBody(ListBlueprintInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBlueprintInstancesResponseBody getBody() {
        return this.body;
    }

}
