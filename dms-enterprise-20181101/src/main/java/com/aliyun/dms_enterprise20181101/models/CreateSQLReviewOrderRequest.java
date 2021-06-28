// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateSQLReviewOrderRequest extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("RelatedUserList")
    public java.util.List<Long> relatedUserList;

    @NameInMap("Param")
    public CreateSQLReviewOrderRequestParam param;

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

    public CreateSQLReviewOrderRequest setRelatedUserList(java.util.List<Long> relatedUserList) {
        this.relatedUserList = relatedUserList;
        return this;
    }
    public java.util.List<Long> getRelatedUserList() {
        return this.relatedUserList;
    }

    public CreateSQLReviewOrderRequest setParam(CreateSQLReviewOrderRequestParam param) {
        this.param = param;
        return this;
    }
    public CreateSQLReviewOrderRequestParam getParam() {
        return this.param;
    }

    public CreateSQLReviewOrderRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class CreateSQLReviewOrderRequestParam extends TeaModel {
        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("DbId")
        public Long dbId;

        @NameInMap("AttachmentKeyList")
        public java.util.List<String> attachmentKeyList;

        public static CreateSQLReviewOrderRequestParam build(java.util.Map<String, ?> map) throws Exception {
            CreateSQLReviewOrderRequestParam self = new CreateSQLReviewOrderRequestParam();
            return TeaModel.build(map, self);
        }

        public CreateSQLReviewOrderRequestParam setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public CreateSQLReviewOrderRequestParam setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public CreateSQLReviewOrderRequestParam setAttachmentKeyList(java.util.List<String> attachmentKeyList) {
            this.attachmentKeyList = attachmentKeyList;
            return this;
        }
        public java.util.List<String> getAttachmentKeyList() {
            return this.attachmentKeyList;
        }

    }

}
