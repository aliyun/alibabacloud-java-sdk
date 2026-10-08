// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListScheduleTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListScheduleTemplatesResponseBody body;

    public static ListScheduleTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScheduleTemplatesResponse self = new ListScheduleTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListScheduleTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScheduleTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListScheduleTemplatesResponse setBody(ListScheduleTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScheduleTemplatesResponseBody getBody() {
        return this.body;
    }

}
