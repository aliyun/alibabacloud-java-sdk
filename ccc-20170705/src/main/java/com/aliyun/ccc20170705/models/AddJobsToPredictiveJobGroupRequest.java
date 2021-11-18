// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class AddJobsToPredictiveJobGroupRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobGroupId")
    public String jobGroupId;

    @NameInMap("JobsJson")
    public java.util.List<String> jobsJson;

    @NameInMap("SkillGroupId")
    public String skillGroupId;

    public static AddJobsToPredictiveJobGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddJobsToPredictiveJobGroupRequest self = new AddJobsToPredictiveJobGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddJobsToPredictiveJobGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddJobsToPredictiveJobGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddJobsToPredictiveJobGroupRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    public AddJobsToPredictiveJobGroupRequest setJobsJson(java.util.List<String> jobsJson) {
        this.jobsJson = jobsJson;
        return this;
    }
    public java.util.List<String> getJobsJson() {
        return this.jobsJson;
    }

    public AddJobsToPredictiveJobGroupRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

}
