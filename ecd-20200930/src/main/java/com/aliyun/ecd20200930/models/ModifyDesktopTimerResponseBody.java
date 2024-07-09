// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopTimerResponseBody extends TeaModel {
    /**
     * <p>The IDs of the cloud computers for which you successfully configure the scheduled task.</p>
     */
    @NameInMap("DesktopIds")
    public java.util.List<String> desktopIds;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4638719F-3CAB-5704-BD54-55617BFF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDesktopTimerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopTimerResponseBody self = new ModifyDesktopTimerResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopTimerResponseBody setDesktopIds(java.util.List<String> desktopIds) {
        this.desktopIds = desktopIds;
        return this;
    }
    public java.util.List<String> getDesktopIds() {
        return this.desktopIds;
    }

    public ModifyDesktopTimerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
