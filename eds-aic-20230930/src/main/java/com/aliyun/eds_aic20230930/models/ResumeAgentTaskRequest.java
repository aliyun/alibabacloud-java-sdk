// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ResumeAgentTaskRequest extends TeaModel {
    /**
     * <p>The additional prompt to append. This parameter takes effect only when the task is passively paused, such as when the task is paused and waiting for user confirmation.</p>
     * 
     * <strong>example:</strong>
     * <p>验证码为***。</p>
     */
    @NameInMap("AdditionalPrompt")
    public String additionalPrompt;

    @NameInMap("ClarificationAnswers")
    public java.util.List<ResumeAgentTaskRequestClarificationAnswers> clarificationAnswers;

    /**
     * <p>The list of task IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskIds")
    public java.util.List<String> taskIds;

    @NameInMap("ToolCallId")
    public String toolCallId;

    public static ResumeAgentTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeAgentTaskRequest self = new ResumeAgentTaskRequest();
        return TeaModel.build(map, self);
    }

    public ResumeAgentTaskRequest setAdditionalPrompt(String additionalPrompt) {
        this.additionalPrompt = additionalPrompt;
        return this;
    }
    public String getAdditionalPrompt() {
        return this.additionalPrompt;
    }

    public ResumeAgentTaskRequest setClarificationAnswers(java.util.List<ResumeAgentTaskRequestClarificationAnswers> clarificationAnswers) {
        this.clarificationAnswers = clarificationAnswers;
        return this;
    }
    public java.util.List<ResumeAgentTaskRequestClarificationAnswers> getClarificationAnswers() {
        return this.clarificationAnswers;
    }

    public ResumeAgentTaskRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    public ResumeAgentTaskRequest setToolCallId(String toolCallId) {
        this.toolCallId = toolCallId;
        return this;
    }
    public String getToolCallId() {
        return this.toolCallId;
    }

    public static class ResumeAgentTaskRequestClarificationAnswers extends TeaModel {
        @NameInMap("CustomValue")
        public String customValue;

        @NameInMap("Id")
        public String id;

        @NameInMap("SelectedIds")
        public java.util.List<String> selectedIds;

        public static ResumeAgentTaskRequestClarificationAnswers build(java.util.Map<String, ?> map) throws Exception {
            ResumeAgentTaskRequestClarificationAnswers self = new ResumeAgentTaskRequestClarificationAnswers();
            return TeaModel.build(map, self);
        }

        public ResumeAgentTaskRequestClarificationAnswers setCustomValue(String customValue) {
            this.customValue = customValue;
            return this;
        }
        public String getCustomValue() {
            return this.customValue;
        }

        public ResumeAgentTaskRequestClarificationAnswers setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ResumeAgentTaskRequestClarificationAnswers setSelectedIds(java.util.List<String> selectedIds) {
            this.selectedIds = selectedIds;
            return this;
        }
        public java.util.List<String> getSelectedIds() {
            return this.selectedIds;
        }

    }

}
