// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListInventoryJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInventoryJobsResponseBody body;

    public static ListInventoryJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInventoryJobsResponse self = new ListInventoryJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListInventoryJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInventoryJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInventoryJobsResponse setBody(ListInventoryJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInventoryJobsResponseBody getBody() {
        return this.body;
    }

}
