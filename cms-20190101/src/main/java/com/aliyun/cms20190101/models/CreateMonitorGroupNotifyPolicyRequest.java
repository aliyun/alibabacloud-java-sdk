// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitorGroupNotifyPolicyRequest extends TeaModel {
    /**
     * <p>The end timestamp.</p>
     * <p>Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1551761781273</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The application group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6780****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The type of the pause notification.</p>
     * <p>Currently, only PauseNotify is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PauseNotify</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start timestamp.</p>
     * <p>Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1551761781273</p>
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
