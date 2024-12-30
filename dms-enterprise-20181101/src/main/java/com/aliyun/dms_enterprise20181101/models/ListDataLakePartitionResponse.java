// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataLakePartitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataLakePartitionResponseBody body;

    public static ListDataLakePartitionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataLakePartitionResponse self = new ListDataLakePartitionResponse();
        return TeaModel.build(map, self);
    }

    public ListDataLakePartitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataLakePartitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataLakePartitionResponse setBody(ListDataLakePartitionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataLakePartitionResponseBody getBody() {
        return this.body;
    }

}
