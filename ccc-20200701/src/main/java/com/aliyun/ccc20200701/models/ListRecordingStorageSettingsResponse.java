// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListRecordingStorageSettingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRecordingStorageSettingsResponseBody body;

    public static ListRecordingStorageSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecordingStorageSettingsResponse self = new ListRecordingStorageSettingsResponse();
        return TeaModel.build(map, self);
    }

    public ListRecordingStorageSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecordingStorageSettingsResponse setBody(ListRecordingStorageSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecordingStorageSettingsResponseBody getBody() {
        return this.body;
    }

}
