// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListSecurityIdentifyRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSecurityIdentifyRecordsResponseBody body;

    public static ListSecurityIdentifyRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityIdentifyRecordsResponse self = new ListSecurityIdentifyRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListSecurityIdentifyRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSecurityIdentifyRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSecurityIdentifyRecordsResponse setBody(ListSecurityIdentifyRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSecurityIdentifyRecordsResponseBody getBody() {
        return this.body;
    }

}
