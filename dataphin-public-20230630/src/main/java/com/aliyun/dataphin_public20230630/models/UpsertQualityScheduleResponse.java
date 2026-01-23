// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpsertQualityScheduleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpsertQualityScheduleResponseBody body;

    public static UpsertQualityScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpsertQualityScheduleResponse self = new UpsertQualityScheduleResponse();
        return TeaModel.build(map, self);
    }

    public UpsertQualityScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpsertQualityScheduleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpsertQualityScheduleResponse setBody(UpsertQualityScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpsertQualityScheduleResponseBody getBody() {
        return this.body;
    }

}
