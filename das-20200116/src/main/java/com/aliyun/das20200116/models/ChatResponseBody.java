// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class ChatResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>waiting_for_agent_thinking</p>
     */
    @NameInMap("ActivityType")
    public String activityType;

    /**
     * <strong>example:</strong>
     * <p>I see you have several PolarDB instances, and I will query them for you shortly</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>hello</p>
     */
    @NameInMap("Delta")
    public String delta;

    /**
     * <strong>example:</strong>
     * <p>61820b594664275c4429****</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <strong>example:</strong>
     * <p>summary</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>76bee207-31ee-4707-8851-6b9d4da033aa</p>
     */
    @NameInMap("ParentMessageId")
    public String parentMessageId;

    /**
     * <strong>example:</strong>
     * <p>assistant</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <strong>example:</strong>
     * <p>ed7cb7b1-ddc8-45d7-9ff3-b315726cb5f7</p>
     */
    @NameInMap("RunId")
    public String runId;

    /**
     * <strong>example:</strong>
     * <p>sub_agent_performance_diagnose_mysql</p>
     */
    @NameInMap("StepName")
    public String stepName;

    /**
     * <strong>example:</strong>
     * <p>das_api</p>
     */
    @NameInMap("TaskTrackerId")
    public String taskTrackerId;

    /**
     * <strong>example:</strong>
     * <p>8e481be1-21d5-4a92-a2fb-fb54be0ab4f6</p>
     */
    @NameInMap("ThreadId")
    public String threadId;

    /**
     * <strong>example:</strong>
     * <p>call_edf9cdb69e0e4c9796a6a5a6</p>
     */
    @NameInMap("ToolCallId")
    public String toolCallId;

    /**
     * <strong>example:</strong>
     * <p>das_api</p>
     */
    @NameInMap("ToolCallName")
    public String toolCallName;

    /**
     * <strong>example:</strong>
     * <p>TEXT_MESSAGE_CONTENT</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>{&quot;CharCount&quot;:393,&quot;End&quot;:1777428785996,&quot;RequestId&quot;:&quot;BE59AED5-D831-5811-BBAD-590B917B2089&quot;,&quot;SessionId&quot;:&quot;123e4567-e89b-12d3-a456-xxxxxxxxxxxx&quot;,&quot;Start&quot;:1777428707927}</p>
     */
    @NameInMap("Value")
    public Object value;

    public static ChatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChatResponseBody self = new ChatResponseBody();
        return TeaModel.build(map, self);
    }

    public ChatResponseBody setActivityType(String activityType) {
        this.activityType = activityType;
        return this;
    }
    public String getActivityType() {
        return this.activityType;
    }

    public ChatResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ChatResponseBody setDelta(String delta) {
        this.delta = delta;
        return this;
    }
    public String getDelta() {
        return this.delta;
    }

    public ChatResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public ChatResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ChatResponseBody setParentMessageId(String parentMessageId) {
        this.parentMessageId = parentMessageId;
        return this;
    }
    public String getParentMessageId() {
        return this.parentMessageId;
    }

    public ChatResponseBody setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ChatResponseBody setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public ChatResponseBody setStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }
    public String getStepName() {
        return this.stepName;
    }

    public ChatResponseBody setTaskTrackerId(String taskTrackerId) {
        this.taskTrackerId = taskTrackerId;
        return this;
    }
    public String getTaskTrackerId() {
        return this.taskTrackerId;
    }

    public ChatResponseBody setThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }
    public String getThreadId() {
        return this.threadId;
    }

    public ChatResponseBody setToolCallId(String toolCallId) {
        this.toolCallId = toolCallId;
        return this;
    }
    public String getToolCallId() {
        return this.toolCallId;
    }

    public ChatResponseBody setToolCallName(String toolCallName) {
        this.toolCallName = toolCallName;
        return this;
    }
    public String getToolCallName() {
        return this.toolCallName;
    }

    public ChatResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ChatResponseBody setValue(Object value) {
        this.value = value;
        return this;
    }
    public Object getValue() {
        return this.value;
    }

}
