// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebPreciseAccessRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>F908E959-ADA8-4D7B-8A05-FF2F67F50964</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWebPreciseAccessRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebPreciseAccessRuleResponseBody self = new ModifyWebPreciseAccessRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWebPreciseAccessRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
