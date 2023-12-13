// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitorGroupNotifyPolicyRequest extends TeaModel {
    /**
     * <p>The timestamp that indicates the end time of the validity period for the policy.</p>
     * <br>
     * <p>This value is a UNIX timestamp that represents the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the application group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The type of the policy. Valid value: PauseNotify.</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The timestamp that indicates the start time of the validity period for the policy.</p>
     * <br>
     * <p>This value is a UNIX timestamp that represents the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static CreateMonitorGroupNotifyPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorGroupNotifyPolicyRequest self = new CreateMonitorGroupNotifyPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateMonitorGroupNotifyPolicyRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateMonitorGroupNotifyPolicyRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateMonitorGroupNotifyPolicyRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public CreateMonitorGroupNotifyPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateMonitorGroupNotifyPolicyRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
