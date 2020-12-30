// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponseBody body;

    public static SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse self = new SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse();
        return TeaModel.build(map, self);
    }

    public SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse setBody(SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponseBody getBody() {
        return this.body;
    }

}
