// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListRamPolicyExportTaskVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRamPolicyExportTaskVersionsResponseBody body;

    public static ListRamPolicyExportTaskVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRamPolicyExportTaskVersionsResponse self = new ListRamPolicyExportTaskVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListRamPolicyExportTaskVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRamPolicyExportTaskVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRamPolicyExportTaskVersionsResponse setBody(ListRamPolicyExportTaskVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRamPolicyExportTaskVersionsResponseBody getBody() {
        return this.body;
    }

}
