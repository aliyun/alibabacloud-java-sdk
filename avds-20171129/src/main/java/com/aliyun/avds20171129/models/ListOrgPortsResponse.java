// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListOrgPortsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOrgPortsResponseBody body;

    public static ListOrgPortsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOrgPortsResponse self = new ListOrgPortsResponse();
        return TeaModel.build(map, self);
    }

    public ListOrgPortsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOrgPortsResponse setBody(ListOrgPortsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOrgPortsResponseBody getBody() {
        return this.body;
    }

}
