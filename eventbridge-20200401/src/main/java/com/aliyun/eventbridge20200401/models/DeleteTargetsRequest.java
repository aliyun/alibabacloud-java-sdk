// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DeleteTargetsRequest extends TeaModel {
    @NameInMap("EventBusName")
    public String eventBusName;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("TargetIds")
    public java.util.List<String> targetIds;

    public static DeleteTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTargetsRequest self = new DeleteTargetsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTargetsRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

    public DeleteTargetsRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DeleteTargetsRequest setTargetIds(java.util.List<String> targetIds) {
        this.targetIds = targetIds;
        return this;
    }
    public java.util.List<String> getTargetIds() {
        return this.targetIds;
    }

}
