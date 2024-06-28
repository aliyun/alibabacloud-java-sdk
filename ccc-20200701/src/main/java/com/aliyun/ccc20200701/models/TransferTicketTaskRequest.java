// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class TransferTicketTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>assignee@ccc-test</p>
     */
    @NameInMap("Assignee")
    public String assignee;

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
     * <p>f780ade8-3ca9-458b-b067-63077946a570</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>5491d3b4-14ee-4341-b5f1-db2c78beddeb</p>
     */
    @NameInMap("TicketId")
    public String ticketId;

    public static TransferTicketTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferTicketTaskRequest self = new TransferTicketTaskRequest();
        return TeaModel.build(map, self);
    }

    public TransferTicketTaskRequest setAssignee(String assignee) {
        this.assignee = assignee;
        return this;
    }
    public String getAssignee() {
        return this.assignee;
    }

    public TransferTicketTaskRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public TransferTicketTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public TransferTicketTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public TransferTicketTaskRequest setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

}
