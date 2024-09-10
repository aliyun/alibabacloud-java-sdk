// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMonitorGroupNotifyPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the application group.</p>
     * 
     * <strong>example:</strong>
     * <p>6780****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The policy type.</p>
     * <p>Valid value: PauseNotify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PauseNotify</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteMonitorGroupNotifyPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMonitorGroupNotifyPolicyRequest self = new DeleteMonitorGroupNotifyPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMonitorGroupNotifyPolicyRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteMonitorGroupNotifyPolicyRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public DeleteMonitorGroupNotifyPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
