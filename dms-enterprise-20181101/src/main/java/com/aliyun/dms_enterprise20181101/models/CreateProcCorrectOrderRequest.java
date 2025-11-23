// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateProcCorrectOrderRequest extends TeaModel {
    /**
     * <p>The key of the attachment for the ticket. The attachment provides more instructions for this operation.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/206069.html">GetUserUploadFileJob</a> operation to query the key of the attachment.</p>
     * 
     * <strong>example:</strong>
     * <p>order_attachment.txt</p>
     */
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    /**
     * <p>The remarks of the ticket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The parameters of the ticket.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Param")
    public CreateProcCorrectOrderRequestParam param;

    /**
     * <p>The operators that are related to the ticket.</p>
     */
    @NameInMap("RelatedUserList")
    public java.util.List<Long> relatedUserList;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p> To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see the <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the &quot;Manage DMS tenants&quot; topic.</p>
     * </blockquote>
     * 
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
         * <p>The database ID. Databases are divided into physical databases and logical databases.</p>
         * <ul>
         * <li>To query the ID of a physical database, call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> or <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation.</li>
         * <li>To query the ID of a logical database, call the <a href="https://help.aliyun.com/document_detail/141874.html">ListLogicDatabases</a> or <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>19721978</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>Specifies whether the database is a logical database. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The database is a logical database.</li>
         * <li><strong>false</strong>: The database is a physical database.</li>
         * </ul>
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
         * <p>The reason for the programmable object change.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Classify")
        public String classify;

        /**
         * <p>The information about the database.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("DbItemList")
        public java.util.List<CreateProcCorrectOrderRequestParamDbItemList> dbItemList;

        /**
         * <p>The mode in which the data change ticket is executed after the ticket is approved. Valid values:</p>
         * <ul>
         * <li><strong>COMMITOR</strong>: The ticket is executed by the user who submits the ticket.</li>
         * <li><strong>AUTO</strong>: The ticket is automatically executed after the ticket is approved.</li>
         * <li><strong>LAST_AUDITOR</strong>: The ticket is executed by the last approver of the ticket.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMMITOR</p>
         */
        @NameInMap("ExecMode")
        public String execMode;

        /**
         * <p>The SQL statements for data change.</p>
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
         * <p>The key of the attachment that contains the SQL statements used to roll back the data change. You can call the <a href="https://help.aliyun.com/document_detail/206069.html">GetUserUploadFileJob</a> operation to obtain the attachment key from the value of AttachmentKey.</p>
         * <blockquote>
         * <p> This parameter is required if you set <strong>RollbackSqlType</strong> to <strong>ATTACHMENT</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test_rollback.sql</p>
         */
        @NameInMap("RollbackAttachmentName")
        public String rollbackAttachmentName;

        /**
         * <p>The SQL statements for rolling back the data change.</p>
         * <blockquote>
         * <p> This parameter is required if you set the <strong>RollbackSqlType</strong> parameter to <strong>TEXT</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>empty</p>
         */
        @NameInMap("RollbackSQL")
        public String rollbackSQL;

        /**
         * <p>The format of the SQL statements used to roll back the data change. Valid values:</p>
         * <ul>
         * <li><strong>TEXT</strong></li>
         * <li><strong>ATTACHMENT</strong></li>
         * </ul>
         * 
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
