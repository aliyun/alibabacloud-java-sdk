// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse setBody(SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponseBody getBody() {
        return this.body;
    }

}
