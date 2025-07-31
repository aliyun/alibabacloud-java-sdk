// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataServiceApiCallStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataServiceApiCallStatisticsResponseBody body;

    public static ListDataServiceApiCallStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApiCallStatisticsResponse self = new ListDataServiceApiCallStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataServiceApiCallStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataServiceApiCallStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataServiceApiCallStatisticsResponse setBody(ListDataServiceApiCallStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataServiceApiCallStatisticsResponseBody getBody() {
        return this.body;
    }

}
