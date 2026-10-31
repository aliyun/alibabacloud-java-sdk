// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitRectifyFlowForReviewRequest extends TeaModel {
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
     * <p>The operator user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The business request parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubmitCommand")
    public SubmitRectifyFlowForReviewRequestSubmitCommand submitCommand;

    public static SubmitRectifyFlowForReviewRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitRectifyFlowForReviewRequest self = new SubmitRectifyFlowForReviewRequest();
        return TeaModel.build(map, self);
    }

    public SubmitRectifyFlowForReviewRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public SubmitRectifyFlowForReviewRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public SubmitRectifyFlowForReviewRequest setSubmitCommand(SubmitRectifyFlowForReviewRequestSubmitCommand submitCommand) {
        this.submitCommand = submitCommand;
        return this;
    }
    public SubmitRectifyFlowForReviewRequestSubmitCommand getSubmitCommand() {
        return this.submitCommand;
    }

    public static class SubmitRectifyFlowForReviewRequestSubmitCommand extends TeaModel {
        /**
         * <p>The description of the rectification result. This parameter is required and can be up to 128 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The ID of the rectification process. Submission is allowed only when the process is in the rectifying or re-rectifying state.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>358710058950</p>
         */
        @NameInMap("RectifyId")
        public Long rectifyId;

        public static SubmitRectifyFlowForReviewRequestSubmitCommand build(java.util.Map<String, ?> map) throws Exception {
            SubmitRectifyFlowForReviewRequestSubmitCommand self = new SubmitRectifyFlowForReviewRequestSubmitCommand();
            return TeaModel.build(map, self);
        }

        public SubmitRectifyFlowForReviewRequestSubmitCommand setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public SubmitRectifyFlowForReviewRequestSubmitCommand setRectifyId(Long rectifyId) {
            this.rectifyId = rectifyId;
            return this;
        }
        public Long getRectifyId() {
            return this.rectifyId;
        }

    }

}
