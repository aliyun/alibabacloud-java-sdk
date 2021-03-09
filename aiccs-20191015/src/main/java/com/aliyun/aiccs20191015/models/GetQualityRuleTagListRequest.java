// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityRuleTagListRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetQualityRuleTagListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQualityRuleTagListRequest self = new GetQualityRuleTagListRequest();
        return TeaModel.build(map, self);
    }

    public GetQualityRuleTagListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
