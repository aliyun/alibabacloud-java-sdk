// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class PublishObjectListRequest extends TeaModel {
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
    public PublishObjectListRequestPublishCommand publishCommand;

    public static PublishObjectListRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishObjectListRequest self = new PublishObjectListRequest();
        return TeaModel.build(map, self);
    }

    public PublishObjectListRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public PublishObjectListRequest setPublishCommand(PublishObjectListRequestPublishCommand publishCommand) {
        this.publishCommand = publishCommand;
        return this;
    }
    public PublishObjectListRequestPublishCommand getPublishCommand() {
        return this.publishCommand;
    }

    public static class PublishObjectListRequestPublishCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>发布</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("SubmitIdList")
        public java.util.List<Long> submitIdList;

        public static PublishObjectListRequestPublishCommand build(java.util.Map<String, ?> map) throws Exception {
            PublishObjectListRequestPublishCommand self = new PublishObjectListRequestPublishCommand();
            return TeaModel.build(map, self);
        }

        public PublishObjectListRequestPublishCommand setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public PublishObjectListRequestPublishCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public PublishObjectListRequestPublishCommand setSubmitIdList(java.util.List<Long> submitIdList) {
            this.submitIdList = submitIdList;
            return this;
        }
        public java.util.List<Long> getSubmitIdList() {
            return this.submitIdList;
        }

    }

}
