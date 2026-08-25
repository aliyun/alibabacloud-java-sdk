// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class ChatResponseBody extends TeaModel {
    /**
     * <p>The heartbeat.</p>
     * 
     * <strong>example:</strong>
     * <p>waiting_for_agent_thinking</p>
     */
    @NameInMap("ActivityType")
    public String activityType;

    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The response content.</p>
     * 
     * <strong>example:</strong>
     * <p>I see you have several PolarDB instances, and I will query them for you shortly</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>Indicates whether the content is incremental.</p>
     * 
     * <strong>example:</strong>
     * <p>hello</p>
     */
    @NameInMap("Delta")
    public String delta;

    @NameInMap("Kind")
    public String kind;

    @NameInMap("Label")
    public String label;

    /**
     * <p>The message ID.</p>
     * 
     * <strong>example:</strong>
     * <p>61820b594664275c4429****</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <p>The extension key.</p>
     * 
     * <strong>example:</strong>
     * <p>summary</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OriginatingToolCallId")
    public String originatingToolCallId;

    @NameInMap("ParentAgentId")
    public String parentAgentId;

    /**
     * <p>The parent message ID.</p>
     * 
     * <strong>example:</strong>
     * <p>76bee207-31ee-4707-8851-6b9d4da033aa</p>
     */
    @NameInMap("ParentMessageId")
    public String parentMessageId;

    /**
     * <p>The conversation role ID.</p>
     * 
     * <strong>example:</strong>
     * <p>assistant</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The run ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ed7cb7b1-ddc8-45d7-9ff3-b315726cb5f7</p>
     */
    @NameInMap("RunId")
    public String runId;

    /**
     * <p>The execution step name.</p>
     * 
     * <strong>example:</strong>
     * <p>sub_agent_performance_diagnose_mysql</p>
     */
    @NameInMap("StepName")
    public String stepName;

    @NameInMap("StepStatus")
    public String stepStatus;

    /**
     * <p>The callback tool class.</p>
     * 
     * <strong>example:</strong>
     * <p>das_api</p>
     */
    @NameInMap("TaskTrackerId")
    public String taskTrackerId;

    /**
     * <p>The thread ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8e481be1-21d5-4a92-a2fb-fb54be0ab4f6</p>
     */
    @NameInMap("ThreadId")
    public String threadId;

    @NameInMap("Timestamp")
    public Long timestamp;

    @NameInMap("ToolCallError")
    public String toolCallError;

    /**
     * <p>The tool calling invoke ID.</p>
     * 
     * <strong>example:</strong>
     * <p>call_edf9cdb69e0e4c9796a6a5a6</p>
     */
    @NameInMap("ToolCallId")
    public String toolCallId;

    /**
     * <p>The tool name.</p>
     * 
     * <strong>example:</strong>
     * <p>das_api</p>
     */
    @NameInMap("ToolCallName")
    public String toolCallName;

    /**
     * <p>The event type.</p>
     * 
     * <strong>example:</strong>
     * <p>TEXT_MESSAGE_CONTENT</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The extension value.</p>
     * 
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

    public ChatResponseBody setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
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

    public ChatResponseBody setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public ChatResponseBody setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
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

    public ChatResponseBody setOriginatingToolCallId(String originatingToolCallId) {
        this.originatingToolCallId = originatingToolCallId;
        return this;
    }
    public String getOriginatingToolCallId() {
        return this.originatingToolCallId;
    }

    public ChatResponseBody setParentAgentId(String parentAgentId) {
        this.parentAgentId = parentAgentId;
        return this;
    }
    public String getParentAgentId() {
        return this.parentAgentId;
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

    public ChatResponseBody setStepStatus(String stepStatus) {
        this.stepStatus = stepStatus;
        return this;
    }
    public String getStepStatus() {
        return this.stepStatus;
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

    public ChatResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public ChatResponseBody setToolCallError(String toolCallError) {
        this.toolCallError = toolCallError;
        return this;
    }
    public String getToolCallError() {
        return this.toolCallError;
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
