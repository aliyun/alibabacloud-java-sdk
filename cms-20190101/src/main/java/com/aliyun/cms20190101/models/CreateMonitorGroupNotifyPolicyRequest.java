// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitorGroupNotifyPolicyRequest extends TeaModel {
    @NameInMap("PolicyType")
    public String policyType;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    public static CreateMonitorGroupNotifyPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorGroupNotifyPolicyRequest self = new CreateMonitorGroupNotifyPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateMonitorGroupNotifyPolicyRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public CreateMonitorGroupNotifyPolicyRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateMonitorGroupNotifyPolicyRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateMonitorGroupNotifyPolicyRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

}
