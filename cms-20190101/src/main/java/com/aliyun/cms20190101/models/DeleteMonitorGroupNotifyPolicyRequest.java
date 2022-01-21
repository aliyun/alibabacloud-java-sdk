// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMonitorGroupNotifyPolicyRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

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
