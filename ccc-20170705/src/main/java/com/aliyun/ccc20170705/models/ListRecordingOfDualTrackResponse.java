// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListRecordingOfDualTrackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRecordingOfDualTrackResponseBody body;

    public static ListRecordingOfDualTrackResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecordingOfDualTrackResponse self = new ListRecordingOfDualTrackResponse();
        return TeaModel.build(map, self);
    }

    public ListRecordingOfDualTrackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecordingOfDualTrackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRecordingOfDualTrackResponse setBody(ListRecordingOfDualTrackResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecordingOfDualTrackResponseBody getBody() {
        return this.body;
    }

}
