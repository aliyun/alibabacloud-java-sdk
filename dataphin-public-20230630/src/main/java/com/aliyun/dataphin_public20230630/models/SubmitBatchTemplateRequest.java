// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitBatchTemplateRequest extends TeaModel {
    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The template submission instruction.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubmitCommand")
    public SubmitBatchTemplateRequestSubmitCommand submitCommand;

    public static SubmitBatchTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitBatchTemplateRequest self = new SubmitBatchTemplateRequest();
        return TeaModel.build(map, self);
    }

    public SubmitBatchTemplateRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public SubmitBatchTemplateRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public SubmitBatchTemplateRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public SubmitBatchTemplateRequest setSubmitCommand(SubmitBatchTemplateRequestSubmitCommand submitCommand) {
        this.submitCommand = submitCommand;
        return this;
    }
    public SubmitBatchTemplateRequestSubmitCommand getSubmitCommand() {
        return this.submitCommand;
    }

    public static class SubmitBatchTemplateRequestSubmitCommand extends TeaModel {
        /**
         * <p>The submission comment.</p>
         * 
         * <strong>example:</strong>
         * <p>Initial submission</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The template ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        public static SubmitBatchTemplateRequestSubmitCommand build(java.util.Map<String, ?> map) throws Exception {
            SubmitBatchTemplateRequestSubmitCommand self = new SubmitBatchTemplateRequestSubmitCommand();
            return TeaModel.build(map, self);
        }

        public SubmitBatchTemplateRequestSubmitCommand setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public SubmitBatchTemplateRequestSubmitCommand setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

}
