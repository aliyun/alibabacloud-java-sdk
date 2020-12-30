// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyClusterSecurityGroupRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyClusterSecurityGroupRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterSecurityGroupRuleResponseBody self = new ModifyClusterSecurityGroupRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClusterSecurityGroupRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
