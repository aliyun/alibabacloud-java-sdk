// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataImportOrderRequest extends TeaModel {
    /**
     * <p>The key of the attachment that provides more instructions for the ticket. You can call the [GetUserUploadFileJob](https://help.aliyun.com/document_detail/206069.html) operation to obtain the attachment key from the value of the AttachmentKey parameter.</p>
     */
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    /**
     * <p>The purpose or objective of the data import. This parameter is used to help reduce unnecessary communication.</p>
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
    public CreateDataImportOrderRequestParam param;

    /**
     * <p>The stakeholders of the data import. All stakeholders can view the ticket details and assist in the approval process. Irrelevant users other than DMS administrators and database administrators (DBAs) are not allowed to view the ticket details.</p>
     */
    @NameInMap("RelatedUserList")
    public java.util.List<Long> relatedUserList;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) or [ListUserTenants](https://help.aliyun.com/document_detail/198074.html) operation to obtain the tenant ID.</p>
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
         * <br>
         * <p>*   To obtain the ID of a physical database, call the [ListDatabases](https://help.aliyun.com/document_detail/141873.html) or [SearchDatabase](https://help.aliyun.com/document_detail/141876.html) operation.</p>
         * <p>*   To obtain the ID of a logical database, call the [ListLogicDatabases](https://help.aliyun.com/document_detail/141874.html) or [SearchDatabase](https://help.aliyun.com/document_detail/141876.html) operation.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>Specifies whether the database is a logical database. Valid values:</p>
         * <br>
         * <p>*   **true**: The database is a logical database.</p>
         * <p>*   **false**: The database is a physical database.</p>
         * <br>
         * <p>>  If you set this parameter to **true**, the database that you specify must be a logical database.</p>
         * <br>
         * <p>This parameter is required.</p>
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
         * <p>The key of the attachment that contains the SQL statements used to import data. You can call the [GetUserUploadFileJob](https://help.aliyun.com/document_detail/206069.html) operation to the attachment key from the value of the AttachmentKey parameter.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("AttachmentName")
        public String attachmentName;

        /**
         * <p>The reason for the data import.</p>
         */
        @NameInMap("Classify")
        public String classify;

        /**
         * <p>The type of the CSV file. Valid values:</p>
         * <br>
         * <p>*   **true**: The first row in the CSV file contains field names.</p>
         * <p>*   **false**: The first row in the CSV file contains data.</p>
         * <br>
         * <p>>  This parameter is required if you set the **FileType** parameter to **CSV**.</p>
         */
        @NameInMap("CsvFirstRowIsColumnDef")
        public Boolean csvFirstRowIsColumnDef;

        /**
         * <p>The database to which you want to import data. You can specify only one database.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("DbItemList")
        public java.util.List<CreateDataImportOrderRequestParamDbItemList> dbItemList;

        /**
         * <p>The encoding algorithm to be used by the destination database. Valid values:</p>
         * <br>
         * <p>*   **AUTO**: automatic identification</p>
         * <p>*   **UTF-8**: UTF-8 encoding</p>
         * <p>*   **GBK**: GBK encoding</p>
         * <p>*   **ISO-8859-1**: ISO-8859-1 encoding</p>
         */
        @NameInMap("FileEncoding")
        public String fileEncoding;

        /**
         * <p>The format of the file for the data import. Valid values:</p>
         * <br>
         * <p>*   **SQL**: an SQL file</p>
         * <p>*   **CSV**: a CSV file</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>Specifies whether to skip an error that occurs. Valid values:</p>
         * <br>
         * <p>*   **true**: skips the error and continues to execute SQL statements.</p>
         * <p>*   **false**: stops executing SQL statements.</p>
         */
        @NameInMap("IgnoreError")
        public Boolean ignoreError;

        /**
         * <p>The import mode. Valid values:</p>
         * <br>
         * <p>*   **FAST_MODE**: In the Execute step, the uploaded file is read and SQL statements are executed to import data to the specified destination database. Compared with the security mode, this mode can be used to import data in a less secure but more efficient manner.</p>
         * <p>*   **SAFE_MODE**: In the Precheck step, the uploaded file is parsed, and SQL statements or CSV file data is cached. In the Execute step, the cached SQL statements are read and executed to import data, or the cached CSV file data is read and imported to the specified destination database. This mode can be used to import data in a more secure but less efficient manner.</p>
         */
        @NameInMap("ImportMode")
        public String importMode;

        /**
         * <p>The mode in which the data in the CSV format is to be written to the destination table. Valid values:</p>
         * <br>
         * <p>*   **INSERT**: The database checks the primary key when data is written. If a duplicate primary key value exists, an error message is returned.</p>
         * <p>*   **INSERT_IGNORE**: If the imported data contains data records that are the same as those in the destination table, the new data records are ignored.</p>
         * <p>*   **REPLACE_INTO**: If the imported data contains a row that has the same value for the primary key or unique index as one row in the destination table, the database deletes the existing row and inserts the new row into the destination table.</p>
         * <br>
         * <p>>  This parameter is required if you set the **FileType** parameter to **CSV**.</p>
         */
        @NameInMap("InsertType")
        public String insertType;

        /**
         * <p>The key of the attachment that contains the SQL statements used to roll back the data import. You can call the [GetUserUploadFileJob](https://help.aliyun.com/document_detail/206069.html) operation to obtain the attachment key from the value of the AttachmentKey parameter.</p>
         * <br>
         * <p>>  This parameter is required if you set the **RollbackSqlType** parameter to **ATTACHMENT**.</p>
         */
        @NameInMap("RollbackAttachmentName")
        public String rollbackAttachmentName;

        /**
         * <p>The SQL statements used to roll back the data import.</p>
         * <br>
         * <p>>  This parameter is required if you set the **RollbackSqlType** parameter to **TEXT**.</p>
         */
        @NameInMap("RollbackSQL")
        public String rollbackSQL;

        /**
         * <p>The format of the SQL statements used to roll back the data import. Valid values:</p>
         * <br>
         * <p>*   **TEXT**: text</p>
         * <p>*   **ATTACHMENT**: attachment</p>
         */
        @NameInMap("RollbackSqlType")
        public String rollbackSqlType;

        /**
         * <p>The destination table to which you want to import the data in the CSV format.</p>
         * <br>
         * <p>>  This parameter is required if you set the **FileType** parameter to **CSV**.</p>
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
