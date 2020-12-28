// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListPreferredEcsTypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPreferredEcsTypesResponseBody body;

    public static ListPreferredEcsTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPreferredEcsTypesResponse self = new ListPreferredEcsTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListPreferredEcsTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPreferredEcsTypesResponse setBody(ListPreferredEcsTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPreferredEcsTypesResponseBody getBody() {
        return this.body;
    }

}
