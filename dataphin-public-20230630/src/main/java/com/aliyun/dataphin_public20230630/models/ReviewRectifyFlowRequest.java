// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ReviewRectifyFlowRequest extends TeaModel {
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
     * <p>The ID of the operator user.</p>
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
    @NameInMap("ReviewCommand")
    public ReviewRectifyFlowRequestReviewCommand reviewCommand;

    public static ReviewRectifyFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        ReviewRectifyFlowRequest self = new ReviewRectifyFlowRequest();
        return TeaModel.build(map, self);
    }

    public ReviewRectifyFlowRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ReviewRectifyFlowRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public ReviewRectifyFlowRequest setReviewCommand(ReviewRectifyFlowRequestReviewCommand reviewCommand) {
        this.reviewCommand = reviewCommand;
        return this;
    }
    public ReviewRectifyFlowRequestReviewCommand getReviewCommand() {
        return this.reviewCommand;
    }

    public static class ReviewRectifyFlowRequestReviewCommand extends TeaModel {
        /**
         * <p>The acceptance description. This parameter is optional and can contain up to 128 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The ID of the rectification process. This operation is allowed only when the process is pending acceptance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>616543434760</p>
         */
        @NameInMap("RectifyId")
        public Long rectifyId;

        /**
         * <p>The acceptance result. Valid values: PASSED and REJECTED.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PASSED</p>
         */
        @NameInMap("ReviewResult")
        public String reviewResult;

        public static ReviewRectifyFlowRequestReviewCommand build(java.util.Map<String, ?> map) throws Exception {
            ReviewRectifyFlowRequestReviewCommand self = new ReviewRectifyFlowRequestReviewCommand();
            return TeaModel.build(map, self);
        }

        public ReviewRectifyFlowRequestReviewCommand setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ReviewRectifyFlowRequestReviewCommand setRectifyId(Long rectifyId) {
            this.rectifyId = rectifyId;
            return this;
        }
        public Long getRectifyId() {
            return this.rectifyId;
        }

        public ReviewRectifyFlowRequestReviewCommand setReviewResult(String reviewResult) {
            this.reviewResult = reviewResult;
            return this;
        }
        public String getReviewResult() {
            return this.reviewResult;
        }

    }

}
