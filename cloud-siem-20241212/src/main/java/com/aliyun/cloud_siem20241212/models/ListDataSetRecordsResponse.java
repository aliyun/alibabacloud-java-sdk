// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataSetRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataSetRecordsResponseBody body;

    public static ListDataSetRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataSetRecordsResponse self = new ListDataSetRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataSetRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataSetRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataSetRecordsResponse setBody(ListDataSetRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataSetRecordsResponseBody getBody() {
        return this.body;
    }

}
