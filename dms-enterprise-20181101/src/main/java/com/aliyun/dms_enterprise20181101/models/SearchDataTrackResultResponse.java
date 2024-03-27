// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchDataTrackResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchDataTrackResultResponseBody body;

    public static SearchDataTrackResultResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchDataTrackResultResponse self = new SearchDataTrackResultResponse();
        return TeaModel.build(map, self);
    }

    public SearchDataTrackResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchDataTrackResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchDataTrackResultResponse setBody(SearchDataTrackResultResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchDataTrackResultResponseBody getBody() {
        return this.body;
    }

}
