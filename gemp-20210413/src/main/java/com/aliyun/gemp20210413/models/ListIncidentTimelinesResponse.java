// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIncidentTimelinesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListIncidentTimelinesResponseBody body;

    public static ListIncidentTimelinesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIncidentTimelinesResponse self = new ListIncidentTimelinesResponse();
        return TeaModel.build(map, self);
    }

    public ListIncidentTimelinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIncidentTimelinesResponse setBody(ListIncidentTimelinesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIncidentTimelinesResponseBody getBody() {
        return this.body;
    }

}
