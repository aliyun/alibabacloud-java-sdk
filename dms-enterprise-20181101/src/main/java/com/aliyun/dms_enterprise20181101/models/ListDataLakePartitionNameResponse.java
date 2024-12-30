// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataLakePartitionNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataLakePartitionNameResponseBody body;

    public static ListDataLakePartitionNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataLakePartitionNameResponse self = new ListDataLakePartitionNameResponse();
        return TeaModel.build(map, self);
    }

    public ListDataLakePartitionNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataLakePartitionNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataLakePartitionNameResponse setBody(ListDataLakePartitionNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataLakePartitionNameResponseBody getBody() {
        return this.body;
    }

}
