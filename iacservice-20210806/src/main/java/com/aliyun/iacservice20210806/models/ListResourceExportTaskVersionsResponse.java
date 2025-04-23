// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListResourceExportTaskVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResourceExportTaskVersionsResponseBody body;

    public static ListResourceExportTaskVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceExportTaskVersionsResponse self = new ListResourceExportTaskVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceExportTaskVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceExportTaskVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourceExportTaskVersionsResponse setBody(ListResourceExportTaskVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceExportTaskVersionsResponseBody getBody() {
        return this.body;
    }

}
