// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetPredictiveJobGroupRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobGroupId")
    public String jobGroupId;

    @NameInMap("SkillGroupId")
    public String skillGroupId;

    public static GetPredictiveJobGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPredictiveJobGroupRequest self = new GetPredictiveJobGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetPredictiveJobGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetPredictiveJobGroupRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    public GetPredictiveJobGroupRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

}
