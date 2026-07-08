// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListDialoguesRequest extends TeaModel {
    /**
     * <p>Unique identifier for the workspace: <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>Page number of the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Current")
    public Integer current;

    /**
     * <p>Generation type. Valid values: 1 (creation) and 2 (intelligent search). Default value: 2.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DialogueType")
    public Integer dialogueType;

    /**
     * <p>End time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-04 11:46:07</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Number of items per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>Start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-04 11:46:07</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>Unique identifier for the task.</p>
     * <blockquote>
     * <p>You do not need to specify TaskId. The system generates it automatically. If you use the same TaskId in later tasks, those tasks belong to the same conversation group.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ListDialoguesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDialoguesRequest self = new ListDialoguesRequest();
        return TeaModel.build(map, self);
    }

    public ListDialoguesRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ListDialoguesRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListDialoguesRequest setDialogueType(Integer dialogueType) {
        this.dialogueType = dialogueType;
        return this;
    }
    public Integer getDialogueType() {
        return this.dialogueType;
    }

    public ListDialoguesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListDialoguesRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListDialoguesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListDialoguesRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
