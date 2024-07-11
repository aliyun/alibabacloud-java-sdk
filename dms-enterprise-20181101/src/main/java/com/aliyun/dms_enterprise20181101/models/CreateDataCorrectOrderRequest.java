// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataCorrectOrderRequest extends TeaModel {
    /**
     * <p>The key of the attachment that provides more instructions for the ticket. You can call the <a href="https://help.aliyun.com/document_detail/206069.html">GetUserUploadFileJob</a> operation to obtain the attachment key from the value of the AttachmentKey parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>order_attachment.txt</p>
     */
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    /**
     * <p>The purpose or objective of the data change. This parameter is used to help reduce unnecessary communication.</p>
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
    public CreateDataCorrectOrderRequestParam param;

    @NameInMap("RealLoginUserUid")
    public String realLoginUserUid;

    /**
     * <p>The stakeholders of the data change. All stakeholders can view the ticket details and assist in the approval process. Irrelevant users other than DMS administrators and database administrators (DBAs) are not allowed to view the ticket details.</p>
     */
    @NameInMap("RelatedUserList")
    public java.util.List<Long> relatedUserList;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to obtain the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static CreateDataCorrectOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataCorrectOrderRequest self = new CreateDataCorrectOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataCorrectOrderRequest setAttachmentKey(String attachmentKey) {
        this.attachmentKey = attachmentKey;
        return this;
    }
    public String getAttachmentKey() {
        return this.attachmentKey;
    }

    public CreateDataCorrectOrderRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateDataCorrectOrderRequest setParam(CreateDataCorrectOrderRequestParam param) {
        this.param = param;
        return this;
    }
    public CreateDataCorrectOrderRequestParam getParam() {
        return this.param;
    }

    public CreateDataCorrectOrderRequest setRealLoginUserUid(String realLoginUserUid) {
        this.realLoginUserUid = realLoginUserUid;
        return this;
    }
    public String getRealLoginUserUid() {
        return this.realLoginUserUid;
    }

    public CreateDataCorrectOrderRequest setRelatedUserList(java.util.List<Long> relatedUserList) {
        this.relatedUserList = relatedUserList;
        return this;
    }
    public java.util.List<Long> getRelatedUserList() {
        return this.relatedUserList;
    }

    public CreateDataCorrectOrderRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class CreateDataCorrectOrderRequestParamDbItemList extends TeaModel {
        /**
         * <p>The ID of the database. The database can be a physical database or a logical database.</p>
         * <ul>
         * <li>To obtain the ID of a physical database, call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> or <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation.</li>
         * <li>To obtain the ID of a logical database, call the <a href="https://help.aliyun.com/document_detail/141874.html">ListLogicDatabases</a> or <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1860****</p>
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

        public static CreateDataCorrectOrderRequestParamDbItemList build(java.util.Map<String, ?> map) throws Exception {
            CreateDataCorrectOrderRequestParamDbItemList self = new CreateDataCorrectOrderRequestParamDbItemList();
            return TeaModel.build(map, self);
        }

        public CreateDataCorrectOrderRequestParamDbItemList setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public CreateDataCorrectOrderRequestParamDbItemList setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

    }

    public static class CreateDataCorrectOrderRequestParam extends TeaModel {
        /**
         * <p>The key of the attachment that contains the SQL statements used to change data. You can call the <a href="https://help.aliyun.com/document_detail/206069.html">GetUserUploadFileJob</a> operation to obtain the attachment key from the value of the AttachmentKey parameter.</p>
         * <blockquote>
         * <p> This parameter is required if you set the <strong>SqlType</strong> parameter to <strong>ATTACHMENT</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test.sql</p>
         */
        @NameInMap("AttachmentName")
        public String attachmentName;

        /**
         * <p>The reason for the data change.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Classify")
        public String classify;

        /**
         * <p>The databases in which you want to change data.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("DbItemList")
        public java.util.List<CreateDataCorrectOrderRequestParamDbItemList> dbItemList;

        /**
         * <p>The estimated number of data rows to be affected by the data change.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EstimateAffectRows")
        public Long estimateAffectRows;

        /**
         * <p>The execution mode of the ticket after the ticket is approved. Valid values:</p>
         * <ul>
         * <li><strong>COMMITOR</strong>: The data change is performed by the user who submits the ticket.</li>
         * <li><strong>AUTO</strong>: The data change is automatically performed after the ticket is approved.</li>
         * <li><strong>LAST_AUDITOR</strong>: The data change is performed by the last approver of the ticket.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMMITOR</p>
         */
        @NameInMap("ExecMode")
        public String execMode;

        /**
         * <p>The SQL statements that you want to execute to change data.</p>
         * <blockquote>
         * <p> This parameter is required if you set the <strong>SqlType</strong> parameter to <strong>TEXT</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>update base_user set id = 1 where id  = 1;</p>
         */
        @NameInMap("ExecSQL")
        public String execSQL;

        /**
         * <p>The key of the attachment that contains the SQL statements used to roll back the data change. You can call the <a href="https://help.aliyun.com/document_detail/206069.html">GetUserUploadFileJob</a> operation to the attachment key from the value of the AttachmentKey parameter.</p>
         * <blockquote>
         * <p> This parameter is required if you set the <strong>RollbackSqlType</strong> parameter to <strong>ATTACHMENT</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test_rollback.sql</p>
         */
        @NameInMap("RollbackAttachmentName")
        public String rollbackAttachmentName;

        /**
         * <p>The SQL statements used to roll back the data change.</p>
         * <blockquote>
         * <p>This parameter is required if you set the <strong>RollbackSqlType</strong> parameter to <strong>TEXT</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>update base_user set id = 1 where id  = 1;</p>
         */
        @NameInMap("RollbackSQL")
        public String rollbackSQL;

        /**
         * <p>The format of the SQL statements used to roll back the data change. Valid values:</p>
         * <ul>
         * <li><strong>TEXT</strong>: text</li>
         * <li><strong>ATTACHMENT</strong>: attachment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TEXT</p>
         */
        @NameInMap("RollbackSqlType")
        public String rollbackSqlType;

        /**
         * <p>The format of the SQL statements used to change data. Valid values:</p>
         * <ul>
         * <li><strong>TEXT</strong>: text</li>
         * <li><strong>ATTACHMENT</strong>: attachment</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TEXT</p>
         */
        @NameInMap("SqlType")
        public String sqlType;

        public static CreateDataCorrectOrderRequestParam build(java.util.Map<String, ?> map) throws Exception {
            CreateDataCorrectOrderRequestParam self = new CreateDataCorrectOrderRequestParam();
            return TeaModel.build(map, self);
        }

        public CreateDataCorrectOrderRequestParam setAttachmentName(String attachmentName) {
            this.attachmentName = attachmentName;
            return this;
        }
        public String getAttachmentName() {
            return this.attachmentName;
        }

        public CreateDataCorrectOrderRequestParam setClassify(String classify) {
            this.classify = classify;
            return this;
        }
        public String getClassify() {
            return this.classify;
        }

        public CreateDataCorrectOrderRequestParam setDbItemList(java.util.List<CreateDataCorrectOrderRequestParamDbItemList> dbItemList) {
            this.dbItemList = dbItemList;
            return this;
        }
        public java.util.List<CreateDataCorrectOrderRequestParamDbItemList> getDbItemList() {
            return this.dbItemList;
        }

        public CreateDataCorrectOrderRequestParam setEstimateAffectRows(Long estimateAffectRows) {
            this.estimateAffectRows = estimateAffectRows;
            return this;
        }
        public Long getEstimateAffectRows() {
            return this.estimateAffectRows;
        }

        public CreateDataCorrectOrderRequestParam setExecMode(String execMode) {
            this.execMode = execMode;
            return this;
        }
        public String getExecMode() {
            return this.execMode;
        }

        public CreateDataCorrectOrderRequestParam setExecSQL(String execSQL) {
            this.execSQL = execSQL;
            return this;
        }
        public String getExecSQL() {
            return this.execSQL;
        }

        public CreateDataCorrectOrderRequestParam setRollbackAttachmentName(String rollbackAttachmentName) {
            this.rollbackAttachmentName = rollbackAttachmentName;
            return this;
        }
        public String getRollbackAttachmentName() {
            return this.rollbackAttachmentName;
        }

        public CreateDataCorrectOrderRequestParam setRollbackSQL(String rollbackSQL) {
            this.rollbackSQL = rollbackSQL;
            return this;
        }
        public String getRollbackSQL() {
            return this.rollbackSQL;
        }

        public CreateDataCorrectOrderRequestParam setRollbackSqlType(String rollbackSqlType) {
            this.rollbackSqlType = rollbackSqlType;
            return this;
        }
        public String getRollbackSqlType() {
            return this.rollbackSqlType;
        }

        public CreateDataCorrectOrderRequestParam setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

    }

}
