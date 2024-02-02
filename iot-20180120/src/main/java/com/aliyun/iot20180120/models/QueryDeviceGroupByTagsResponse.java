// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceGroupByTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDeviceGroupByTagsResponseBody body;

    public static QueryDeviceGroupByTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceGroupByTagsResponse self = new QueryDeviceGroupByTagsResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceGroupByTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceGroupByTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDeviceGroupByTagsResponse setBody(QueryDeviceGroupByTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceGroupByTagsResponseBody getBody() {
        return this.body;
    }

}
