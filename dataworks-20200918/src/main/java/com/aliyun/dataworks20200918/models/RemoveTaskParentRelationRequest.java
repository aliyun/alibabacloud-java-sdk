// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class RemoveTaskParentRelationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ParentInstanceIds")
    public String parentInstanceIds;

    public static RemoveTaskParentRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveTaskParentRelationRequest self = new RemoveTaskParentRelationRequest();
        return TeaModel.build(map, self);
    }

    public RemoveTaskParentRelationRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public RemoveTaskParentRelationRequest setParentInstanceIds(String parentInstanceIds) {
        this.parentInstanceIds = parentInstanceIds;
        return this;
    }
    public String getParentInstanceIds() {
        return this.parentInstanceIds;
    }

}
