// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoTriggerRecordRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TriggerRecordId")
    public String triggerRecordId;

    public static ListRepoTriggerRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRepoTriggerRecordRequest self = new ListRepoTriggerRecordRequest();
        return TeaModel.build(map, self);
    }

    public ListRepoTriggerRecordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListRepoTriggerRecordRequest setTriggerRecordId(String triggerRecordId) {
        this.triggerRecordId = triggerRecordId;
        return this;
    }
    public String getTriggerRecordId() {
        return this.triggerRecordId;
    }

}
