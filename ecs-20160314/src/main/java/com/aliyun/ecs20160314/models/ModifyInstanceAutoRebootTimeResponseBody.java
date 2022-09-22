// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyInstanceAutoRebootTimeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceAutoRebootTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAutoRebootTimeResponseBody self = new ModifyInstanceAutoRebootTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAutoRebootTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
