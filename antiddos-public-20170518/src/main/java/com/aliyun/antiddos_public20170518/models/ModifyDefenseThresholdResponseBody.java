// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class ModifyDefenseThresholdResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDefenseThresholdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseThresholdResponseBody self = new ModifyDefenseThresholdResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseThresholdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
