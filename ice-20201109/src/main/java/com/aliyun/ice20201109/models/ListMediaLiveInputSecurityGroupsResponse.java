// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaLiveInputSecurityGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMediaLiveInputSecurityGroupsResponseBody body;

    public static ListMediaLiveInputSecurityGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMediaLiveInputSecurityGroupsResponse self = new ListMediaLiveInputSecurityGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListMediaLiveInputSecurityGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMediaLiveInputSecurityGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMediaLiveInputSecurityGroupsResponse setBody(ListMediaLiveInputSecurityGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMediaLiveInputSecurityGroupsResponseBody getBody() {
        return this.body;
    }

}
