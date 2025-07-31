// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityScanRunsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataQualityScanRunsResponseBody body;

    public static ListDataQualityScanRunsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityScanRunsResponse self = new ListDataQualityScanRunsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataQualityScanRunsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataQualityScanRunsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataQualityScanRunsResponse setBody(ListDataQualityScanRunsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataQualityScanRunsResponseBody getBody() {
        return this.body;
    }

}
