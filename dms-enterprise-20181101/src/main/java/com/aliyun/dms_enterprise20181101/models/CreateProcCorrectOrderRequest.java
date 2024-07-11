// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateProcCorrectOrderRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>order_attachment.txt</p>
     */
    @NameInMap("AttachmentKey")
    public String attachmentKey;

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
     */
    @NameInMap("Param")
    public CreateProcCorrectOrderRequestParam param;

    @NameInMap("RelatedUserList")
    public java.util.List<Long> relatedUserList;

    /**
     * <strong>example:</strong>
     * <p>4***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static CreateProcCorrectOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProcCorrectOrderRequest self = new CreateProcCorrectOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateProcCorrectOrderRequest setAttachmentKey(String attachmentKey) {
        this.attachmentKey = attachmentKey;
        return this;
    }
    public String getAttachmentKey() {
        return this.attachmentKey;
    }

    public CreateProcCorrectOrderRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateProcCorrectOrderRequest setParam(CreateProcCorrectOrderRequestParam param) {
        this.param = param;
        return this;
    }
    public CreateProcCorrectOrderRequestParam getParam() {
        return this.param;
    }

    public CreateProcCorrectOrderRequest setRelatedUserList(java.util.List<Long> relatedUserList) {
        this.relatedUserList = relatedUserList;
        return this;
    }
    public java.util.List<Long> getRelatedUserList() {
        return this.relatedUserList;
    }

    public CreateProcCorrectOrderRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class CreateProcCorrectOrderRequestParamDbItemList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>19721978</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        public static CreateProcCorrectOrderRequestParamDbItemList build(java.util.Map<String, ?> map) throws Exception {
            CreateProcCorrectOrderRequestParamDbItemList self = new CreateProcCorrectOrderRequestParamDbItemList();
            return TeaModel.build(map, self);
        }

        public CreateProcCorrectOrderRequestParamDbItemList setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public CreateProcCorrectOrderRequestParamDbItemList setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

    }

    public static class CreateProcCorrectOrderRequestParam extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Classify")
        public String classify;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("DbItemList")
        public java.util.List<CreateProcCorrectOrderRequestParamDbItemList> dbItemList;

        @NameInMap("ExecMode")
        public String execMode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DELIMITER ///
         * CREATE PROCEDURE GetAllProducts()
         * BEGIN
         * SELECT *  FROM base_user;
         * END ///</p>
         */
        @NameInMap("ExecSQL")
        public String execSQL;

        /**
         * <strong>example:</strong>
         * <p>test_rollback.sql</p>
         */
        @NameInMap("RollbackAttachmentName")
        public String rollbackAttachmentName;

        /**
         * <strong>example:</strong>
         * <p>empty</p>
         */
        @NameInMap("RollbackSQL")
        public String rollbackSQL;

        /**
         * <strong>example:</strong>
         * <p>TEXT</p>
         */
        @NameInMap("RollbackSqlType")
        public String rollbackSqlType;

        public static CreateProcCorrectOrderRequestParam build(java.util.Map<String, ?> map) throws Exception {
            CreateProcCorrectOrderRequestParam self = new CreateProcCorrectOrderRequestParam();
            return TeaModel.build(map, self);
        }

        public CreateProcCorrectOrderRequestParam setClassify(String classify) {
            this.classify = classify;
            return this;
        }
        public String getClassify() {
            return this.classify;
        }

        public CreateProcCorrectOrderRequestParam setDbItemList(java.util.List<CreateProcCorrectOrderRequestParamDbItemList> dbItemList) {
            this.dbItemList = dbItemList;
            return this;
        }
        public java.util.List<CreateProcCorrectOrderRequestParamDbItemList> getDbItemList() {
            return this.dbItemList;
        }

        public CreateProcCorrectOrderRequestParam setExecMode(String execMode) {
            this.execMode = execMode;
            return this;
        }
        public String getExecMode() {
            return this.execMode;
        }

        public CreateProcCorrectOrderRequestParam setExecSQL(String execSQL) {
            this.execSQL = execSQL;
            return this;
        }
        public String getExecSQL() {
            return this.execSQL;
        }

        public CreateProcCorrectOrderRequestParam setRollbackAttachmentName(String rollbackAttachmentName) {
            this.rollbackAttachmentName = rollbackAttachmentName;
            return this;
        }
        public String getRollbackAttachmentName() {
            return this.rollbackAttachmentName;
        }

        public CreateProcCorrectOrderRequestParam setRollbackSQL(String rollbackSQL) {
            this.rollbackSQL = rollbackSQL;
            return this;
        }
        public String getRollbackSQL() {
            return this.rollbackSQL;
        }

        public CreateProcCorrectOrderRequestParam setRollbackSqlType(String rollbackSqlType) {
            this.rollbackSqlType = rollbackSqlType;
            return this;
        }
        public String getRollbackSqlType() {
            return this.rollbackSqlType;
        }

    }

}
