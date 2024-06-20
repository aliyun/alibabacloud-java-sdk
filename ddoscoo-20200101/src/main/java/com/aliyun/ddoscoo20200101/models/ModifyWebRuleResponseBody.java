// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CB3261D2-7D1B-4ADA-9E98-A200B2CDA2DC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWebRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebRuleResponseBody self = new ModifyWebRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWebRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
