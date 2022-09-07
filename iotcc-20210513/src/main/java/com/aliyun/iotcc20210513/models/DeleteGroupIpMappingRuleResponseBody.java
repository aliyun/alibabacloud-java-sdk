// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DeleteGroupIpMappingRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteGroupIpMappingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupIpMappingRuleResponseBody self = new DeleteGroupIpMappingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGroupIpMappingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
