// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigDomainAccessModeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigDomainAccessModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigDomainAccessModeResponseBody self = new ConfigDomainAccessModeResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigDomainAccessModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
