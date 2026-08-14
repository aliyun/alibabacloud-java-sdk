// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebRuleResponseBody extends TeaModel {
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
