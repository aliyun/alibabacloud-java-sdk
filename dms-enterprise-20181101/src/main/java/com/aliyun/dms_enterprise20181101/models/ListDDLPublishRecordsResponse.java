// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDDLPublishRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDDLPublishRecordsResponseBody body;

    public static ListDDLPublishRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDDLPublishRecordsResponse self = new ListDDLPublishRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListDDLPublishRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDDLPublishRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDDLPublishRecordsResponse setBody(ListDDLPublishRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDDLPublishRecordsResponseBody getBody() {
        return this.body;
    }

}
