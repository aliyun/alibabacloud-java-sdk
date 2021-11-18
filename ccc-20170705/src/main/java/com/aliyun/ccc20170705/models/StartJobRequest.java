// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class StartJobRequest extends TeaModel {
    @NameInMap("CallingNumber")
    public java.util.List<String> callingNumber;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobJson")
    public String jobJson;

    @NameInMap("ScenarioId")
    public String scenarioId;

    @NameInMap("SelfHostedCallCenter")
    public Boolean selfHostedCallCenter;

    public static StartJobRequest build(java.util.Map<String, ?> map) throws Exception {
        StartJobRequest self = new StartJobRequest();
        return TeaModel.build(map, self);
    }

    public StartJobRequest setCallingNumber(java.util.List<String> callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public java.util.List<String> getCallingNumber() {
        return this.callingNumber;
    }

    public StartJobRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public StartJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartJobRequest setJobJson(String jobJson) {
        this.jobJson = jobJson;
        return this;
    }
    public String getJobJson() {
        return this.jobJson;
    }

    public StartJobRequest setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public String getScenarioId() {
        return this.scenarioId;
    }

    public StartJobRequest setSelfHostedCallCenter(Boolean selfHostedCallCenter) {
        this.selfHostedCallCenter = selfHostedCallCenter;
        return this;
    }
    public Boolean getSelfHostedCallCenter() {
        return this.selfHostedCallCenter;
    }

}
