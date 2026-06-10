// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetSkillFileDetectResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSkillFileDetectResultResponseBody body;

    public static GetSkillFileDetectResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSkillFileDetectResultResponse self = new GetSkillFileDetectResultResponse();
        return TeaModel.build(map, self);
    }

    public GetSkillFileDetectResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSkillFileDetectResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSkillFileDetectResultResponse setBody(GetSkillFileDetectResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSkillFileDetectResultResponseBody getBody() {
        return this.body;
    }

}
