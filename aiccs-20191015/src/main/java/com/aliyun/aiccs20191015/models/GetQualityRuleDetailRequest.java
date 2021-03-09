// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityRuleDetailRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("QualityRuleId")
    public Long qualityRuleId;

    public static GetQualityRuleDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQualityRuleDetailRequest self = new GetQualityRuleDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetQualityRuleDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetQualityRuleDetailRequest setQualityRuleId(Long qualityRuleId) {
        this.qualityRuleId = qualityRuleId;
        return this;
    }
    public Long getQualityRuleId() {
        return this.qualityRuleId;
    }

}
