// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateGroupIpMappingRuleResponseBody extends TeaModel {
    @NameInMap("GroupIpMappingRuleId")
    public String groupIpMappingRuleId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateGroupIpMappingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupIpMappingRuleResponseBody self = new CreateGroupIpMappingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGroupIpMappingRuleResponseBody setGroupIpMappingRuleId(String groupIpMappingRuleId) {
        this.groupIpMappingRuleId = groupIpMappingRuleId;
        return this;
    }
    public String getGroupIpMappingRuleId() {
        return this.groupIpMappingRuleId;
    }

    public CreateGroupIpMappingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
