// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteLineageRelationshipRequest extends TeaModel {
    /**
     * <p>The ID of the lineage relationship. You can obtain this ID from the response of the ListLineageRelationships operation. The ID is in the format of <code>${accountId}:${srcEntityType}.${srcEntityId}:${dstEntityType}.${dstEntityId}:${taskType}.${taskId}</code>, where accountId is the Alibaba Cloud account ID, srcEntityType and srcEntityId are the source entity type and source entity ID, dstEntityType and dstEntityId are the destination entity type and destination entity ID, and taskType and taskId are the lineage task type and task ID. Example: <code>1245491995595649:custom-report.report_test_001:custom-table.table_test_001:custom-lineage-task.test_task_001</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4as3dasf654a</p>
     */
    @NameInMap("Id")
    public String id;

    public static DeleteLineageRelationshipRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLineageRelationshipRequest self = new DeleteLineageRelationshipRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLineageRelationshipRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
