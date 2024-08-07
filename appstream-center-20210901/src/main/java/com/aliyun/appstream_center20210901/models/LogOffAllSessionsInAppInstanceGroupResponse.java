// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class LogOffAllSessionsInAppInstanceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LogOffAllSessionsInAppInstanceGroupResponseBody body;

    public static LogOffAllSessionsInAppInstanceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        LogOffAllSessionsInAppInstanceGroupResponse self = new LogOffAllSessionsInAppInstanceGroupResponse();
        return TeaModel.build(map, self);
    }

    public LogOffAllSessionsInAppInstanceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LogOffAllSessionsInAppInstanceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LogOffAllSessionsInAppInstanceGroupResponse setBody(LogOffAllSessionsInAppInstanceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public LogOffAllSessionsInAppInstanceGroupResponseBody getBody() {
        return this.body;
    }

}
