// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetEmonAlarmRecordStatisticsDistributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEmonAlarmRecordStatisticsDistributeResponseBody body;

    public static GetEmonAlarmRecordStatisticsDistributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEmonAlarmRecordStatisticsDistributeResponse self = new GetEmonAlarmRecordStatisticsDistributeResponse();
        return TeaModel.build(map, self);
    }

    public GetEmonAlarmRecordStatisticsDistributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEmonAlarmRecordStatisticsDistributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEmonAlarmRecordStatisticsDistributeResponse setBody(GetEmonAlarmRecordStatisticsDistributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEmonAlarmRecordStatisticsDistributeResponseBody getBody() {
        return this.body;
    }

}
