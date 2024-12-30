// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListSubmitRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSubmitRecordsResponseBody body;

    public static ListSubmitRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSubmitRecordsResponse self = new ListSubmitRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListSubmitRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSubmitRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSubmitRecordsResponse setBody(ListSubmitRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSubmitRecordsResponseBody getBody() {
        return this.body;
    }

}
