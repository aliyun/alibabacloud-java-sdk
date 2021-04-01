// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigDomainAccessModeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ConfigDomainAccessModeResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigDomainAccessModeResponse self = new ConfigDomainAccessModeResponse();
        return TeaModel.build(map, self);
    }

    public ConfigDomainAccessModeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
