// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListBlueprintInstanceCreatorsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListBlueprintInstanceCreatorsResponseBody body;

    public static ListBlueprintInstanceCreatorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBlueprintInstanceCreatorsResponse self = new ListBlueprintInstanceCreatorsResponse();
        return TeaModel.build(map, self);
    }

    public ListBlueprintInstanceCreatorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBlueprintInstanceCreatorsResponse setBody(ListBlueprintInstanceCreatorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBlueprintInstanceCreatorsResponseBody getBody() {
        return this.body;
    }

}
