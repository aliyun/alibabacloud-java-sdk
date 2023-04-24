// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataTrackJobDegreeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDataTrackJobDegreeResponseBody body;

    public static GetDataTrackJobDegreeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataTrackJobDegreeResponse self = new GetDataTrackJobDegreeResponse();
        return TeaModel.build(map, self);
    }

    public GetDataTrackJobDegreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataTrackJobDegreeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataTrackJobDegreeResponse setBody(GetDataTrackJobDegreeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataTrackJobDegreeResponseBody getBody() {
        return this.body;
    }

}
