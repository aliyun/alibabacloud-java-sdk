// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateSQLReviewOrderRequest extends TeaModel {
    /**
     * <p>The purpose or objective of the SQL review. This reduces unnecessary communication.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The parameters of the ticket.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Param")
    public CreateSQLReviewOrderRequestParam param;

    /**
     * <p>The stakeholders involved in this operation. All the specified stakeholders can view the ticket details and take part in the approval process. Irrelevant users other than DMS administrators and database administrators (DBAs) are not allowed to view the ticket details.</p>
     */
    @NameInMap("RelatedUserList")
    public java.util.List<Long> relatedUserList;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) or [ListUserTenants](https://help.aliyun.com/document_detail/198074.html) operation to obtain the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static CreateSQLReviewOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSQLReviewOrderRequest self = new CreateSQLReviewOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateSQLReviewOrderRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateSQLReviewOrderRequest setParam(CreateSQLReviewOrderRequestParam param) {
        this.param = param;
        return this;
    }
    public CreateSQLReviewOrderRequestParam getParam() {
        return this.param;
    }

    public CreateSQLReviewOrderRequest setRelatedUserList(java.util.List<Long> relatedUserList) {
        this.relatedUserList = relatedUserList;
        return this;
    }
    public java.util.List<Long> getRelatedUserList() {
        return this.relatedUserList;
    }

    public CreateSQLReviewOrderRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class CreateSQLReviewOrderRequestParam extends TeaModel {
        /**
         * <p>The files to be reviewed. Multiple files can be reviewed at a time.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("AttachmentKeyList")
        public java.util.List<String> attachmentKeyList;

        /**
         * <p>The ID of the database. You can call the [SearchDatabases](https://help.aliyun.com/document_detail/141876.html) operation to query the ID of the database.</p>
         * <br>
         * <p>>  You can call this operation to query only physical databases. This operation is unavailable to query logical databases.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>The name of the project.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        public static CreateSQLReviewOrderRequestParam build(java.util.Map<String, ?> map) throws Exception {
            CreateSQLReviewOrderRequestParam self = new CreateSQLReviewOrderRequestParam();
            return TeaModel.build(map, self);
        }

        public CreateSQLReviewOrderRequestParam setAttachmentKeyList(java.util.List<String> attachmentKeyList) {
            this.attachmentKeyList = attachmentKeyList;
            return this;
        }
        public java.util.List<String> getAttachmentKeyList() {
            return this.attachmentKeyList;
        }

        public CreateSQLReviewOrderRequestParam setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public CreateSQLReviewOrderRequestParam setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

}
