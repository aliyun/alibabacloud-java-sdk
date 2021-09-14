// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDedicatedHostAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostAccountResponseBody self = new ModifyDedicatedHostAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
