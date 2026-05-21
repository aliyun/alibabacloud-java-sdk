// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GetLastUpgradeRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLastUpgradeRecordResponseBody body;

    public static GetLastUpgradeRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLastUpgradeRecordResponse self = new GetLastUpgradeRecordResponse();
        return TeaModel.build(map, self);
    }

    public GetLastUpgradeRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLastUpgradeRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLastUpgradeRecordResponse setBody(GetLastUpgradeRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLastUpgradeRecordResponseBody getBody() {
        return this.body;
    }

}
