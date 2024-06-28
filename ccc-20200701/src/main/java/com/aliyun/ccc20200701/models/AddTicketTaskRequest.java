// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddTicketTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>assignee@ccc-test</p>
     */
    @NameInMap("Assignee")
    public String assignee;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>After</p>
     */
    @NameInMap("Position")
    public String position;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3b8c672f-48f6-45f5-bf41-9d4cb2b4a716</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3d26b90a-c5d2-4b09-8219-********</p>
     */
    @NameInMap("TicketId")
    public String ticketId;

    public static AddTicketTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTicketTaskRequest self = new AddTicketTaskRequest();
        return TeaModel.build(map, self);
    }

    public AddTicketTaskRequest setAssignee(String assignee) {
        this.assignee = assignee;
        return this;
    }
    public String getAssignee() {
        return this.assignee;
    }

    public AddTicketTaskRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public AddTicketTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddTicketTaskRequest setPosition(String position) {
        this.position = position;
        return this;
    }
    public String getPosition() {
        return this.position;
    }

    public AddTicketTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public AddTicketTaskRequest setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

}
