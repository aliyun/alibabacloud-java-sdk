// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListDialoguesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Current")
    public Integer current;

    @NameInMap("DialogueType")
    public Integer dialogueType;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("StartTime")
    public String startTime;

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
