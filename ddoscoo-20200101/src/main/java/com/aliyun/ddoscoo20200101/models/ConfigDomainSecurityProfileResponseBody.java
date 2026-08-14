// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigDomainSecurityProfileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigDomainSecurityProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigDomainSecurityProfileResponseBody self = new ConfigDomainSecurityProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigDomainSecurityProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
