// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebAIProtectSwitchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWebAIProtectSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebAIProtectSwitchResponseBody self = new ModifyWebAIProtectSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWebAIProtectSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
