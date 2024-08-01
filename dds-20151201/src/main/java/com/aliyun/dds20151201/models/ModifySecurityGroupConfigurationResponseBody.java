// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupConfigurationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E062C482-1A4B-469E-938C-96D28CFAE42E</p>
     */
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
