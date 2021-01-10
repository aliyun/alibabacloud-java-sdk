// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveStreamRecordIndexFilesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLiveStreamRecordIndexFilesResponseBody body;

    public static CreateLiveStreamRecordIndexFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveStreamRecordIndexFilesResponse self = new CreateLiveStreamRecordIndexFilesResponse();
        return TeaModel.build(map, self);
    }

    public CreateLiveStreamRecordIndexFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLiveStreamRecordIndexFilesResponse setBody(CreateLiveStreamRecordIndexFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLiveStreamRecordIndexFilesResponseBody getBody() {
        return this.body;
    }

}
