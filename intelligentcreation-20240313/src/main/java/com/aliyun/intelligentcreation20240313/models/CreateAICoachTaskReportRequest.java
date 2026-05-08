// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateAICoachTaskReportRequest extends TeaModel {
    @NameInMap("dialogueList")
    public java.util.List<CreateAICoachTaskReportRequestDialogueList> dialogueList;

    /**
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("idempotentId")
    public String idempotentId;

    /**
     * <strong>example:</strong>
     * <p>874890065171169280</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static CreateAICoachTaskReportRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAICoachTaskReportRequest self = new CreateAICoachTaskReportRequest();
        return TeaModel.build(map, self);
    }

    public CreateAICoachTaskReportRequest setDialogueList(java.util.List<CreateAICoachTaskReportRequestDialogueList> dialogueList) {
        this.dialogueList = dialogueList;
        return this;
    }
    public java.util.List<CreateAICoachTaskReportRequestDialogueList> getDialogueList() {
        return this.dialogueList;
    }

    public CreateAICoachTaskReportRequest setIdempotentId(String idempotentId) {
        this.idempotentId = idempotentId;
        return this;
    }
    public String getIdempotentId() {
        return this.idempotentId;
    }

    public CreateAICoachTaskReportRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class CreateAICoachTaskReportRequestDialogueList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>coach</p>
         */
        @NameInMap("role")
        public String role;

        public static CreateAICoachTaskReportRequestDialogueList build(java.util.Map<String, ?> map) throws Exception {
            CreateAICoachTaskReportRequestDialogueList self = new CreateAICoachTaskReportRequestDialogueList();
            return TeaModel.build(map, self);
        }

        public CreateAICoachTaskReportRequestDialogueList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateAICoachTaskReportRequestDialogueList setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
