// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListAvailableEcsTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListAvailableEcsTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAvailableEcsTypesResponse setBody(ListAvailableEcsTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAvailableEcsTypesResponseBody getBody() {
        return this.body;
    }

}
