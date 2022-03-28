// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class UpdateRecordingStorageSettingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRecordingStorageSettingsResponseBody body;

    public static UpdateRecordingStorageSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecordingStorageSettingsResponse self = new UpdateRecordingStorageSettingsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRecordingStorageSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRecordingStorageSettingsResponse setBody(UpdateRecordingStorageSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRecordingStorageSettingsResponseBody getBody() {
        return this.body;
    }

}
