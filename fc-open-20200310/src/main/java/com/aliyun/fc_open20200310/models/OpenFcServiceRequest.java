// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20200310.models;

import com.aliyun.tea.*;

public class OpenFcServiceRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    public static OpenFcServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenFcServiceRequest self = new OpenFcServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenFcServiceRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
