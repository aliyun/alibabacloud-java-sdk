// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryImportedDeviceByApplyIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryImportedDeviceByApplyIdResponseBody body;

    public static QueryImportedDeviceByApplyIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryImportedDeviceByApplyIdResponse self = new QueryImportedDeviceByApplyIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryImportedDeviceByApplyIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryImportedDeviceByApplyIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryImportedDeviceByApplyIdResponse setBody(QueryImportedDeviceByApplyIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryImportedDeviceByApplyIdResponseBody getBody() {
        return this.body;
    }

}
