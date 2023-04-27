// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateFreeLockCorrectOrderRequest extends TeaModel {
    /**
     * <p>The key of the attachment that provides more instructions for the ticket. You can call the [GetUserUploadFileJob](~~206069~~) operation to obtain the attachment key from the value of the AttachmentKey parameter.</p>
     */
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    /**
     * <p>The stakeholders of the data change. All stakeholders can view the ticket details and assist in the approval process. Irrelevant users other than DMS administrators and database administrators (DBAs) are not allowed to view the ticket details.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The key of the attachment that contains the SQL statements used to roll back the data change.</p>
     */
    @NameInMap("Param")
    public CreateFreeLockCorrectOrderRequestParam param;

    /**
     * <p>The parameters of the ticket.</p>
     */
    @NameInMap("RelatedUserList")
    public java.util.List<Long> relatedUserList;

    /**
     * <p>The ID of the ticket.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static CreateFreeLockCorrectOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFreeLockCorrectOrderRequest self = new CreateFreeLockCorrectOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateFreeLockCorrectOrderRequest setAttachmentKey(String attachmentKey) {
        this.attachmentKey = attachmentKey;
        return this;
    }
    public String getAttachmentKey() {
        return this.attachmentKey;
    }

    public CreateFreeLockCorrectOrderRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateFreeLockCorrectOrderRequest setParam(CreateFreeLockCorrectOrderRequestParam param) {
        this.param = param;
        return this;
    }
    public CreateFreeLockCorrectOrderRequestParam getParam() {
        return this.param;
    }

    public CreateFreeLockCorrectOrderRequest setRelatedUserList(java.util.List<Long> relatedUserList) {
        this.relatedUserList = relatedUserList;
        return this;
    }
    public java.util.List<Long> getRelatedUserList() {
        return this.relatedUserList;
    }

    public CreateFreeLockCorrectOrderRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class CreateFreeLockCorrectOrderRequestParamDbItemList extends TeaModel {
        /**
         * <p>The purpose or objective of the data change. This parameter is used to help reduce unnecessary communication.</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>The SQL statements used to roll back the data change.</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        public static CreateFreeLockCorrectOrderRequestParamDbItemList build(java.util.Map<String, ?> map) throws Exception {
            CreateFreeLockCorrectOrderRequestParamDbItemList self = new CreateFreeLockCorrectOrderRequestParamDbItemList();
            return TeaModel.build(map, self);
        }

        public CreateFreeLockCorrectOrderRequestParamDbItemList setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public CreateFreeLockCorrectOrderRequestParamDbItemList setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

    }

    public static class CreateFreeLockCorrectOrderRequestParam extends TeaModel {
        /**
         * <p>Specifies whether the database is a logical database. Valid values:</p>
         * <br>
         * <p>*   **true**: The database is a logical database.</p>
         * <p>*   **false**: The database is a physical database.</p>
         */
        @NameInMap("AttachmentName")
        public String attachmentName;

        /**
         * <p>The error code returned if the request fails.</p>
         */
        @NameInMap("Classify")
        public String classify;

        /**
         * <p>The key of the attachment that contains the SQL statements used to change data. This parameter is not supported.</p>
         */
        @NameInMap("DbItemList")
        public java.util.List<CreateFreeLockCorrectOrderRequestParamDbItemList> dbItemList;

        /**
         * <p>The ID of the database. The database can be a physical database or a logical database.</p>
         * <br>
         * <p>*   To obtain the ID of a physical database, call the [ListDatabases](~~141873~~) or [SearchDatabase](~~141876~~) operation.</p>
         * <p>*   To obtain the ID of a logical database, call the [ListLogicDatabases](~~141874~~) or [SearchDatabase](~~141876~~) operation.</p>
         */
        @NameInMap("ExecMode")
        public String execMode;

        /**
         * <p>The format of the SQL statements used to roll back the data change. Valid values:</p>
         * <br>
         * <p>*   **TEXT**: text</p>
         * <p>*   **ATTACHMENT**: attachment. This value is not supported.</p>
         */
        @NameInMap("ExecSQL")
        public String execSQL;

        /**
         * <p>The error message returned if the request fails.</p>
         */
        @NameInMap("RollbackAttachmentName")
        public String rollbackAttachmentName;

        /**
         * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.</p>
         */
        @NameInMap("RollbackSQL")
        public String rollbackSQL;

        /**
         * <p>The databases in which you want to change data.</p>
         */
        @NameInMap("RollbackSqlType")
        public String rollbackSqlType;

        /**
         * <p>The operation that you want to perform. Set the value to CreateFreeLockCorrectOrder.</p>
         */
        @NameInMap("SqlType")
        public String sqlType;

        public static CreateFreeLockCorrectOrderRequestParam build(java.util.Map<String, ?> map) throws Exception {
            CreateFreeLockCorrectOrderRequestParam self = new CreateFreeLockCorrectOrderRequestParam();
            return TeaModel.build(map, self);
        }

        public CreateFreeLockCorrectOrderRequestParam setAttachmentName(String attachmentName) {
            this.attachmentName = attachmentName;
            return this;
        }
        public String getAttachmentName() {
            return this.attachmentName;
        }

        public CreateFreeLockCorrectOrderRequestParam setClassify(String classify) {
            this.classify = classify;
            return this;
        }
        public String getClassify() {
            return this.classify;
        }

        public CreateFreeLockCorrectOrderRequestParam setDbItemList(java.util.List<CreateFreeLockCorrectOrderRequestParamDbItemList> dbItemList) {
            this.dbItemList = dbItemList;
            return this;
        }
        public java.util.List<CreateFreeLockCorrectOrderRequestParamDbItemList> getDbItemList() {
            return this.dbItemList;
        }

        public CreateFreeLockCorrectOrderRequestParam setExecMode(String execMode) {
            this.execMode = execMode;
            return this;
        }
        public String getExecMode() {
            return this.execMode;
        }

        public CreateFreeLockCorrectOrderRequestParam setExecSQL(String execSQL) {
            this.execSQL = execSQL;
            return this;
        }
        public String getExecSQL() {
            return this.execSQL;
        }

        public CreateFreeLockCorrectOrderRequestParam setRollbackAttachmentName(String rollbackAttachmentName) {
            this.rollbackAttachmentName = rollbackAttachmentName;
            return this;
        }
        public String getRollbackAttachmentName() {
            return this.rollbackAttachmentName;
        }

        public CreateFreeLockCorrectOrderRequestParam setRollbackSQL(String rollbackSQL) {
            this.rollbackSQL = rollbackSQL;
            return this;
        }
        public String getRollbackSQL() {
            return this.rollbackSQL;
        }

        public CreateFreeLockCorrectOrderRequestParam setRollbackSqlType(String rollbackSqlType) {
            this.rollbackSqlType = rollbackSqlType;
            return this;
        }
        public String getRollbackSqlType() {
            return this.rollbackSqlType;
        }

        public CreateFreeLockCorrectOrderRequestParam setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

    }

}
