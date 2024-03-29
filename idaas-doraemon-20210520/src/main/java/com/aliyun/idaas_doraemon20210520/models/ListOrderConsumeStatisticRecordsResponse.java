// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class ListOrderConsumeStatisticRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOrderConsumeStatisticRecordsResponseBody body;

    public static ListOrderConsumeStatisticRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOrderConsumeStatisticRecordsResponse self = new ListOrderConsumeStatisticRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListOrderConsumeStatisticRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOrderConsumeStatisticRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOrderConsumeStatisticRecordsResponse setBody(ListOrderConsumeStatisticRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOrderConsumeStatisticRecordsResponseBody getBody() {
        return this.body;
    }

}
