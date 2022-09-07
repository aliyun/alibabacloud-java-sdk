// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DeleteIpMappingRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIpMappingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpMappingRuleResponseBody self = new DeleteIpMappingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIpMappingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
