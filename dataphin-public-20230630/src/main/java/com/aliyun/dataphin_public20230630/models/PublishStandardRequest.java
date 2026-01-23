// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class PublishStandardRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PublishCommand")
    public PublishStandardRequestPublishCommand publishCommand;

    public static PublishStandardRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishStandardRequest self = new PublishStandardRequest();
        return TeaModel.build(map, self);
    }

    public PublishStandardRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public PublishStandardRequest setPublishCommand(PublishStandardRequestPublishCommand publishCommand) {
        this.publishCommand = publishCommand;
        return this;
    }
    public PublishStandardRequestPublishCommand getPublishCommand() {
        return this.publishCommand;
    }

    public static class PublishStandardRequestPublishCommand extends TeaModel {
        @NameInMap("AutoPublishAfterApproval")
        public Boolean autoPublishAfterApproval;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("ReviewerIdList")
        public java.util.List<String> reviewerIdList;

        /**
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("StandardStage")
        public String standardStage;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static PublishStandardRequestPublishCommand build(java.util.Map<String, ?> map) throws Exception {
            PublishStandardRequestPublishCommand self = new PublishStandardRequestPublishCommand();
            return TeaModel.build(map, self);
        }

        public PublishStandardRequestPublishCommand setAutoPublishAfterApproval(Boolean autoPublishAfterApproval) {
            this.autoPublishAfterApproval = autoPublishAfterApproval;
            return this;
        }
        public Boolean getAutoPublishAfterApproval() {
            return this.autoPublishAfterApproval;
        }

        public PublishStandardRequestPublishCommand setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public PublishStandardRequestPublishCommand setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PublishStandardRequestPublishCommand setReviewerIdList(java.util.List<String> reviewerIdList) {
            this.reviewerIdList = reviewerIdList;
            return this;
        }
        public java.util.List<String> getReviewerIdList() {
            return this.reviewerIdList;
        }

        public PublishStandardRequestPublishCommand setStandardStage(String standardStage) {
            this.standardStage = standardStage;
            return this;
        }
        public String getStandardStage() {
            return this.standardStage;
        }

        public PublishStandardRequestPublishCommand setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
