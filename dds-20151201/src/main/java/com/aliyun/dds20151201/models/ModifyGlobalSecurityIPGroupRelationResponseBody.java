// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyGlobalSecurityIPGroupRelationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyGlobalSecurityIPGroupRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyGlobalSecurityIPGroupRelationResponseBody self = new ModifyGlobalSecurityIPGroupRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyGlobalSecurityIPGroupRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
