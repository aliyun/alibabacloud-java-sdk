// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs_workbench20251111.models;

import com.aliyun.tea.*;

public class ModifyTerminalSettingsResponseBody extends TeaModel {
    /**
     * <p>请求ID</p>
     * 
     * <strong>example:</strong>
     * <p>47348885-C929-489A-93D7-B2E99D50D77B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTerminalSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTerminalSettingsResponseBody self = new ModifyTerminalSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTerminalSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
