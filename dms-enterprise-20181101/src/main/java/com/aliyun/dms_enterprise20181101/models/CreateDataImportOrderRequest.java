// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataImportOrderRequest extends TeaModel {
    /**
     * <p>The key of the attachment that provides more instructions for the ticket. You can call the <a href="https://help.aliyun.com/document_detail/206069.html">GetUserUploadFileJob</a> operation to obtain the attachment key from the value of the AttachmentKey parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>order_attachment.txt</p>
     */
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    /**
     * <p>The purpose or objective of the data import. This parameter is used to help reduce unnecessary communication.</p>
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
    public CreateDataImportOrderRequestParam param;

    /**
     * <p>The stakeholders of the data import. All stakeholders can view the ticket details and assist in the approval process. Irrelevant users other than DMS administrators and database administrators (DBAs) are not allowed to view the ticket details.</p>
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

    public static CreateDataImportOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataImportOrderRequest self = new CreateDataImportOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataImportOrderRequest setAttachmentKey(String attachmentKey) {
        this.attachmentKey = attachmentKey;
        return this;
    }
    public String getAttachmentKey() {
        return this.attachmentKey;
    }

    public CreateDataImportOrderRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateDataImportOrderRequest setParam(CreateDataImportOrderRequestParam param) {
        this.param = param;
        return this;
    }
    public CreateDataImportOrderRequestParam getParam() {
        return this.param;
    }

    public CreateDataImportOrderRequest setRelatedUserList(java.util.List<Long> relatedUserList) {
        this.relatedUserList = relatedUserList;
        return this;
    }
    public java.util.List<Long> getRelatedUserList() {
        return this.relatedUserList;
    }

    public CreateDataImportOrderRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class CreateDataImportOrderRequestParamDbItemList extends TeaModel {
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
         * <blockquote>
         * <p> If you set this parameter to <strong>true</strong>, the database that you specify must be a logical database.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        public static CreateDataImportOrderRequestParamDbItemList build(java.util.Map<String, ?> map) throws Exception {
            CreateDataImportOrderRequestParamDbItemList self = new CreateDataImportOrderRequestParamDbItemList();
            return TeaModel.build(map, self);
        }

        public CreateDataImportOrderRequestParamDbItemList setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public CreateDataImportOrderRequestParamDbItemList setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

    }

    public static class CreateDataImportOrderRequestParam extends TeaModel {
        /**
         * <p>The key of the attachment that contains the SQL statements used to import data. You can call the <a href="https://help.aliyun.com/document_detail/206069.html">GetUserUploadFileJob</a> operation to the attachment key from the value of the AttachmentKey parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>order_text</p>
         */
        @NameInMap("AttachmentName")
        public String attachmentName;

        /**
         * <p>The reason for the data import.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Classify")
        public String classify;

        /**
         * <p>The type of the CSV file. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The first row in the CSV file contains field names.</li>
         * <li><strong>false</strong>: The first row in the CSV file contains data.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required if you set the <strong>FileType</strong> parameter to <strong>CSV</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CsvFirstRowIsColumnDef")
        public Boolean csvFirstRowIsColumnDef;

        /**
         * <p>The database to which you want to import data. You can specify only one database.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("DbItemList")
        public java.util.List<CreateDataImportOrderRequestParamDbItemList> dbItemList;

        /**
         * <p>The encoding algorithm to be used by the destination database. Valid values:</p>
         * <ul>
         * <li><strong>AUTO</strong>: automatic identification</li>
         * <li><strong>UTF-8</strong>: UTF-8 encoding</li>
         * <li><strong>GBK</strong>: GBK encoding</li>
         * <li><strong>ISO-8859-1</strong>: ISO-8859-1 encoding</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AUTO</p>
         */
        @NameInMap("FileEncoding")
        public String fileEncoding;

        /**
         * <p>The format of the file for the data import. Valid values:</p>
         * <ul>
         * <li><strong>SQL</strong>: an SQL file</li>
         * <li><strong>CSV</strong>: a CSV file</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CSV</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>Specifies whether to skip an error that occurs. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: skips the error and continues to execute SQL statements.</li>
         * <li><strong>false</strong>: stops executing SQL statements.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IgnoreError")
        public Boolean ignoreError;

        /**
         * <p>The import mode. Valid values:</p>
         * <ul>
         * <li><strong>FAST_MODE</strong>: In the Execute step, the uploaded file is read and SQL statements are executed to import data to the specified destination database. Compared with the security mode, this mode can be used to import data in a less secure but more efficient manner.</li>
         * <li><strong>SAFE_MODE</strong>: In the Precheck step, the uploaded file is parsed, and SQL statements or CSV file data is cached. In the Execute step, the cached SQL statements are read and executed to import data, or the cached CSV file data is read and imported to the specified destination database. This mode can be used to import data in a more secure but less efficient manner.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FAST_MODE</p>
         */
        @NameInMap("ImportMode")
        public String importMode;

        /**
         * <p>The mode in which the data in the CSV format is to be written to the destination table. Valid values:</p>
         * <ul>
         * <li><strong>INSERT</strong>: The database checks the primary key when data is written. If a duplicate primary key value exists, an error message is returned.</li>
         * <li><strong>INSERT_IGNORE</strong>: If the imported data contains data records that are the same as those in the destination table, the new data records are ignored.</li>
         * <li><strong>REPLACE_INTO</strong>: If the imported data contains a row that has the same value for the primary key or unique index as one row in the destination table, the database deletes the existing row and inserts the new row into the destination table.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required if you set the <strong>FileType</strong> parameter to <strong>CSV</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>INSERT</p>
         */
        @NameInMap("InsertType")
        public String insertType;

        /**
         * <p>The key of the attachment that contains the SQL statements used to roll back the data import. You can call the <a href="https://help.aliyun.com/document_detail/206069.html">GetUserUploadFileJob</a> operation to obtain the attachment key from the value of the AttachmentKey parameter.</p>
         * <blockquote>
         * <p> This parameter is required if you set the <strong>RollbackSqlType</strong> parameter to <strong>ATTACHMENT</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rollback.sql</p>
         */
        @NameInMap("RollbackAttachmentName")
        public String rollbackAttachmentName;

        /**
         * <p>The SQL statements used to roll back the data import.</p>
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
         * <p>The format of the SQL statements used to roll back the data import. Valid values:</p>
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
         * <p>The destination table to which you want to import the data in the CSV format.</p>
         * <blockquote>
         * <p> This parameter is required if you set the <strong>FileType</strong> parameter to <strong>CSV</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Table_text</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static CreateDataImportOrderRequestParam build(java.util.Map<String, ?> map) throws Exception {
            CreateDataImportOrderRequestParam self = new CreateDataImportOrderRequestParam();
            return TeaModel.build(map, self);
        }

        public CreateDataImportOrderRequestParam setAttachmentName(String attachmentName) {
            this.attachmentName = attachmentName;
            return this;
        }
        public String getAttachmentName() {
            return this.attachmentName;
        }

        public CreateDataImportOrderRequestParam setClassify(String classify) {
            this.classify = classify;
            return this;
        }
        public String getClassify() {
            return this.classify;
        }

        public CreateDataImportOrderRequestParam setCsvFirstRowIsColumnDef(Boolean csvFirstRowIsColumnDef) {
            this.csvFirstRowIsColumnDef = csvFirstRowIsColumnDef;
            return this;
        }
        public Boolean getCsvFirstRowIsColumnDef() {
            return this.csvFirstRowIsColumnDef;
        }

        public CreateDataImportOrderRequestParam setDbItemList(java.util.List<CreateDataImportOrderRequestParamDbItemList> dbItemList) {
            this.dbItemList = dbItemList;
            return this;
        }
        public java.util.List<CreateDataImportOrderRequestParamDbItemList> getDbItemList() {
            return this.dbItemList;
        }

        public CreateDataImportOrderRequestParam setFileEncoding(String fileEncoding) {
            this.fileEncoding = fileEncoding;
            return this;
        }
        public String getFileEncoding() {
            return this.fileEncoding;
        }

        public CreateDataImportOrderRequestParam setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public CreateDataImportOrderRequestParam setIgnoreError(Boolean ignoreError) {
            this.ignoreError = ignoreError;
            return this;
        }
        public Boolean getIgnoreError() {
            return this.ignoreError;
        }

        public CreateDataImportOrderRequestParam setImportMode(String importMode) {
            this.importMode = importMode;
            return this;
        }
        public String getImportMode() {
            return this.importMode;
        }

        public CreateDataImportOrderRequestParam setInsertType(String insertType) {
            this.insertType = insertType;
            return this;
        }
        public String getInsertType() {
            return this.insertType;
        }

        public CreateDataImportOrderRequestParam setRollbackAttachmentName(String rollbackAttachmentName) {
            this.rollbackAttachmentName = rollbackAttachmentName;
            return this;
        }
        public String getRollbackAttachmentName() {
            return this.rollbackAttachmentName;
        }

        public CreateDataImportOrderRequestParam setRollbackSQL(String rollbackSQL) {
            this.rollbackSQL = rollbackSQL;
            return this;
        }
        public String getRollbackSQL() {
            return this.rollbackSQL;
        }

        public CreateDataImportOrderRequestParam setRollbackSqlType(String rollbackSqlType) {
            this.rollbackSqlType = rollbackSqlType;
            return this;
        }
        public String getRollbackSqlType() {
            return this.rollbackSqlType;
        }

        public CreateDataImportOrderRequestParam setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
