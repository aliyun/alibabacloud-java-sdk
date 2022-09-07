// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateIpMappingRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateIpMappingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpMappingRuleResponseBody self = new UpdateIpMappingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIpMappingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
