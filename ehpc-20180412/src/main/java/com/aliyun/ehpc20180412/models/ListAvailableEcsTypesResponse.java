// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListAvailableEcsTypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAvailableEcsTypesResponseBody body;

    public static ListAvailableEcsTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableEcsTypesResponse self = new ListAvailableEcsTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListAvailableEcsTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAvailableEcsTypesResponse setBody(ListAvailableEcsTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAvailableEcsTypesResponseBody getBody() {
        return this.body;
    }

}
