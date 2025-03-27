// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class ModifyIpDefenseThresholdResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>BC0607F8-A9F3-5E11-977B-D59CD58C64ED</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyIpDefenseThresholdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpDefenseThresholdResponseBody self = new ModifyIpDefenseThresholdResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyIpDefenseThresholdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
