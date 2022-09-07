// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateIpMappingRuleResponseBody extends TeaModel {
    @NameInMap("IpMappingRuleId")
    public String ipMappingRuleId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateIpMappingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIpMappingRuleResponseBody self = new CreateIpMappingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIpMappingRuleResponseBody setIpMappingRuleId(String ipMappingRuleId) {
        this.ipMappingRuleId = ipMappingRuleId;
        return this;
    }
    public String getIpMappingRuleId() {
        return this.ipMappingRuleId;
    }

    public CreateIpMappingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
