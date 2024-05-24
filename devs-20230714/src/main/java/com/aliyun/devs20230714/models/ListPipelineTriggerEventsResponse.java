// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ListPipelineTriggerEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPipelineTriggerEventsResponseBody body;

    public static ListPipelineTriggerEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineTriggerEventsResponse self = new ListPipelineTriggerEventsResponse();
        return TeaModel.build(map, self);
    }

    public ListPipelineTriggerEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPipelineTriggerEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPipelineTriggerEventsResponse setBody(ListPipelineTriggerEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPipelineTriggerEventsResponseBody getBody() {
        return this.body;
    }

}
