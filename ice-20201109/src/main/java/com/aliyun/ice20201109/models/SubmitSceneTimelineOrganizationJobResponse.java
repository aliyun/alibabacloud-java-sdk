// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSceneTimelineOrganizationJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitSceneTimelineOrganizationJobResponseBody body;

    public static SubmitSceneTimelineOrganizationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSceneTimelineOrganizationJobResponse self = new SubmitSceneTimelineOrganizationJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSceneTimelineOrganizationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSceneTimelineOrganizationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitSceneTimelineOrganizationJobResponse setBody(SubmitSceneTimelineOrganizationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSceneTimelineOrganizationJobResponseBody getBody() {
        return this.body;
    }

}
