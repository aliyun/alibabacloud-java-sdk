// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySoundCodeScheduleListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySoundCodeScheduleListResponseBody body;

    public static QuerySoundCodeScheduleListResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySoundCodeScheduleListResponse self = new QuerySoundCodeScheduleListResponse();
        return TeaModel.build(map, self);
    }

    public QuerySoundCodeScheduleListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySoundCodeScheduleListResponse setBody(QuerySoundCodeScheduleListResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySoundCodeScheduleListResponseBody getBody() {
        return this.body;
    }

}
