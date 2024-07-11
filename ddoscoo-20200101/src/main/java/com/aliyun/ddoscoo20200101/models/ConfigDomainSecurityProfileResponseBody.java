// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigDomainSecurityProfileResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9728769F-9466-534E-BE12-CAB29A675828</p>
     */
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
