// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupConfigurationResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySecurityGroupConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityGroupConfigurationResponseBody self = new ModifySecurityGroupConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySecurityGroupConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
