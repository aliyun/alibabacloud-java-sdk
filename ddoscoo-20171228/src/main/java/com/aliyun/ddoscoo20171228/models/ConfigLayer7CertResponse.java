// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigLayer7CertResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ConfigLayer7CertResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer7CertResponse self = new ConfigLayer7CertResponse();
        return TeaModel.build(map, self);
    }

    public ConfigLayer7CertResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
