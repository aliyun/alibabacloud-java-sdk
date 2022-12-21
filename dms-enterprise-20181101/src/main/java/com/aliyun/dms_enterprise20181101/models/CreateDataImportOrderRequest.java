// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataImportOrderRequest extends TeaModel {
    // The key of the attachment that provides more instructions for the ticket. You can call the [GetUserUploadFileJob](~~206069~~) operation to obtain the attachment key from the value of the AttachmentKey parameter.
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    // The purpose or objective of the data import. This parameter is used to help reduce unnecessary communication.
    @NameInMap("Comment")
    public String comment;

    // The parameters of the ticket.
    @NameInMap("Param")
    public CreateDataImportOrderRequestParam param;

    // The stakeholders of the data import. All stakeholders can view the ticket details and assist in the approval process. Irrelevant users other than DMS administrators and database administrators (DBAs) are not allowed to view the ticket details.
    @NameInMap("RelatedUserList")
    public java.util.List<Long> relatedUserList;

    // The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.
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
        // The ID of the database. The database can be a physical database or a logical database.
        // 
        // *   To obtain the ID of a physical database, call the [ListDatabases](~~141873~~) or [SearchDatabase](~~141876~~) operation.
        // *   To obtain the ID of a logical database, call the [ListLogicDatabases](~~141874~~) or [SearchDatabase](~~141876~~) operation.
        @NameInMap("DbId")
        public Long dbId;

        // Specifies whether the database is a logical database. Valid values:
        // 
        // *   **true**: The database is a logical database.
        // *   **false**: The database is a physical database.
        // 
        // >  If you set this parameter to **true**, the database that you specify must be a logical database.
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
        // The key of the attachment that contains the SQL statements used to import data. You can call the [GetUserUploadFileJob](~~206069~~) operation to the attachment key from the value of the AttachmentKey parameter.
        @NameInMap("AttachmentName")
        public String attachmentName;

        // The reason for the data import.
        @NameInMap("Classify")
        public String classify;

        // The type of the CSV file. Valid values:
        // 
        // *   **true**: The first row in the CSV file contains field names.
        // *   **false**: The first row in the CSV file contains data.
        // 
        // >  This parameter is required if you set the **FileType** parameter to **CSV**.
        @NameInMap("CsvFirstRowIsColumnDef")
        public Boolean csvFirstRowIsColumnDef;

        // The database to which you want to import data. You can specify only one database.
        @NameInMap("DbItemList")
        public java.util.List<CreateDataImportOrderRequestParamDbItemList> dbItemList;

        // The encoding algorithm to be used by the destination database. Valid values:
        // 
        // *   **AUTO**: automatic identification
        // *   **UTF-8**: UTF-8 encoding
        // *   **GBK**: GBK encoding
        // *   **ISO-8859-1**: ISO-8859-1 encoding
        @NameInMap("FileEncoding")
        public String fileEncoding;

        // The format of the file for the data import. Valid values:
        // 
        // *   **SQL**: an SQL file
        // *   **CSV**: a CSV file
        @NameInMap("FileType")
        public String fileType;

        // Specifies whether to skip an error that occurs. Valid values:
        // 
        // *   **true**: skips the error and continues to execute SQL statements.
        // *   **false**: stops executing SQL statements.
        @NameInMap("IgnoreError")
        public Boolean ignoreError;

        // The import mode. Valid values:
        // 
        // *   **FAST_MODE**: In the Execute step, the uploaded file is read and SQL statements are executed to import data to the specified destination database. Compared with the security mode, this mode can be used to import data in a less secure but more efficient manner.
        // *   **SAFE_MODE**: In the Precheck step, the uploaded file is parsed, and SQL statements or CSV file data is cached. In the Execute step, the cached SQL statements are read and executed to import data, or the cached CSV file data is read and imported to the specified destination database. This mode can be used to import data in a more secure but less efficient manner.
        @NameInMap("ImportMode")
        public String importMode;

        // The mode in which the data in the CSV format is to be written to the destination table. Valid values:
        // 
        // *   **INSERT**: The database checks the primary key when data is written. If a duplicate primary key value exists, an error message is returned.
        // *   **INSERT_IGNORE**: If the imported data contains data records that are the same as those in the destination table, the new data records are ignored.
        // *   **REPLACE_INTO**: If the imported data contains a row that has the same value for the primary key or unique index as one row in the destination table, the database deletes the existing row and inserts the new row into the destination table.
        // 
        // >  This parameter is required if you set the **FileType** parameter to **CSV**.
        @NameInMap("InsertType")
        public String insertType;

        // The key of the attachment that contains the SQL statements used to roll back the data import. You can call the [GetUserUploadFileJob](~~206069~~) operation to obtain the attachment key from the value of the AttachmentKey parameter.
        // 
        // >  This parameter is required if you set the **RollbackSqlType** parameter to **ATTACHMENT**.
        @NameInMap("RollbackAttachmentName")
        public String rollbackAttachmentName;

        // The SQL statements used to roll back the data import.
        // 
        // >  This parameter is required if you set the **RollbackSqlType** parameter to **TEXT**.
        @NameInMap("RollbackSQL")
        public String rollbackSQL;

        // The format of the SQL statements used to roll back the data import. Valid values:
        // 
        // *   **TEXT**: text
        // *   **ATTACHMENT**: attachment
        @NameInMap("RollbackSqlType")
        public String rollbackSqlType;

        // The destination table to which you want to import the data in the CSV format.
        // 
        // >  This parameter is required if you set the **FileType** parameter to **CSV**.
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
