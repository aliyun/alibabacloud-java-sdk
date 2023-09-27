// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListEventCenterRuleNameRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListEventCenterRuleNameRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEventCenterRuleNameRequest self = new ListEventCenterRuleNameRequest();
        return TeaModel.build(map, self);
    }

    public ListEventCenterRuleNameRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
