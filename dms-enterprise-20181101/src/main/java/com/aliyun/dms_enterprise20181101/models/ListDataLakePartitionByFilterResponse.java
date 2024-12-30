// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataLakePartitionByFilterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataLakePartitionByFilterResponseBody body;

    public static ListDataLakePartitionByFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataLakePartitionByFilterResponse self = new ListDataLakePartitionByFilterResponse();
        return TeaModel.build(map, self);
    }

    public ListDataLakePartitionByFilterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataLakePartitionByFilterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataLakePartitionByFilterResponse setBody(ListDataLakePartitionByFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataLakePartitionByFilterResponseBody getBody() {
        return this.body;
    }

}
