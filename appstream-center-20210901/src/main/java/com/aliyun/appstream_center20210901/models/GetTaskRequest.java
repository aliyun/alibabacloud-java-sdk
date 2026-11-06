// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetTaskRequest extends TeaModel {
    /**
     * <p>The associated resource ID. <strong>If you do not specify the TaskId parameter, you must specify the EntityId, EntityType, and TaskCategory parameters at the same time.</strong> The resource ID must match the selected resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>imgc-bp1example****</p>
     */
    @NameInMap("EntityId")
    public String entityId;

    /**
     * <p>The associated resource type. This parameter is required if you do not specify the TaskId parameter.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>IMAGE</strong>: image resource.</li>
     * <li><strong>APP</strong>: application resource.</li>
     * <li><strong>SNAPSHOT</strong>: snapshot resource.</li>
     * </ul>
     * <p>You must also select an applicable TaskCategory. The resource type itself does not mean that all task categories can be queried by resource.</p>
     * 
     * <strong>example:</strong>
     * <p>IMAGE</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The associated resource version ID. This parameter is used to specify the version when you query by resource. For image resources, specify the image version ID.</p>
     * 
     * <strong>example:</strong>
     * <p>iv-bp1example****</p>
     */
    @NameInMap("EntityVersionId")
    public String entityVersionId;

    /**
     * <p>The task category when you query by resource. This parameter is required if you do not specify the TaskId parameter.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>IMAGE_BUILDER</strong>: image creation. Queries tasks for manual creation, automatic creation, or creation based on an instance.</li>
     * <li><strong>IMAGE_DISTRIBUTE</strong>: image distribution across regions.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IMAGE_BUILDER</p>
     */
    @NameInMap("TaskCategory")
    public String taskCategory;

    /**
     * <p>The task ID. If you specify this parameter, the system queries the task by this ID first, and the resource information query conditions are no longer used for locating the task.</p>
     * 
     * <strong>example:</strong>
     * <p>tid-bp1example****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p><strong>Not enabled. Do not specify this parameter.</strong> When you query a task, locate the task by using the TaskId parameter or the resource information and TaskCategory parameter. This parameter is not used for task filtering.</p>
     * <p>The example &quot;Not applicable (not enabled)&quot; is only a description of the field status, not a valid parameter value.</p>
     * 
     * <strong>example:</strong>
     * <p>Not applicable (not enabled)</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static GetTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskRequest self = new GetTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public GetTaskRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public GetTaskRequest setEntityVersionId(String entityVersionId) {
        this.entityVersionId = entityVersionId;
        return this;
    }
    public String getEntityVersionId() {
        return this.entityVersionId;
    }

    public GetTaskRequest setTaskCategory(String taskCategory) {
        this.taskCategory = taskCategory;
        return this;
    }
    public String getTaskCategory() {
        return this.taskCategory;
    }

    public GetTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
