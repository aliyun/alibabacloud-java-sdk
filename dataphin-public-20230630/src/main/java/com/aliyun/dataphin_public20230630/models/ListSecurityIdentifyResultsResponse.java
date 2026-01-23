// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListSecurityIdentifyResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSecurityIdentifyResultsResponseBody body;

    public static ListSecurityIdentifyResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityIdentifyResultsResponse self = new ListSecurityIdentifyResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListSecurityIdentifyResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSecurityIdentifyResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSecurityIdentifyResultsResponse setBody(ListSecurityIdentifyResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSecurityIdentifyResultsResponseBody getBody() {
        return this.body;
    }

}
