// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListRamPolicyExportTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRamPolicyExportTasksResponseBody body;

    public static ListRamPolicyExportTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRamPolicyExportTasksResponse self = new ListRamPolicyExportTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListRamPolicyExportTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRamPolicyExportTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRamPolicyExportTasksResponse setBody(ListRamPolicyExportTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRamPolicyExportTasksResponseBody getBody() {
        return this.body;
    }

}
