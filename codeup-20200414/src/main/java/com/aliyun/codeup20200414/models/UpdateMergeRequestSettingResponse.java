// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class UpdateMergeRequestSettingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMergeRequestSettingResponseBody body;

    public static UpdateMergeRequestSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMergeRequestSettingResponse self = new UpdateMergeRequestSettingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMergeRequestSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMergeRequestSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMergeRequestSettingResponse setBody(UpdateMergeRequestSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMergeRequestSettingResponseBody getBody() {
        return this.body;
    }

}
