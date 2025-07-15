// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListRtcMPUTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRtcMPUTaskDetailResponseBody body;

    public static ListRtcMPUTaskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRtcMPUTaskDetailResponse self = new ListRtcMPUTaskDetailResponse();
        return TeaModel.build(map, self);
    }

    public ListRtcMPUTaskDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRtcMPUTaskDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRtcMPUTaskDetailResponse setBody(ListRtcMPUTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRtcMPUTaskDetailResponseBody getBody() {
        return this.body;
    }

}
