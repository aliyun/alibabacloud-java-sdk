// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIncidentDetailTimelinesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListIncidentDetailTimelinesResponseBody body;

    public static ListIncidentDetailTimelinesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIncidentDetailTimelinesResponse self = new ListIncidentDetailTimelinesResponse();
        return TeaModel.build(map, self);
    }

    public ListIncidentDetailTimelinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIncidentDetailTimelinesResponse setBody(ListIncidentDetailTimelinesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIncidentDetailTimelinesResponseBody getBody() {
        return this.body;
    }

}
