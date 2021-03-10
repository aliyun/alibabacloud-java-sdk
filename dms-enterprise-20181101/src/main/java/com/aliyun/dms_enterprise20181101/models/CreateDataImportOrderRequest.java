// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataImportOrderRequest extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("RelatedUserList")
    public java.util.List<Long> relatedUserList;

    @NameInMap("Param")
    public CreateDataImportOrderRequestParam param;

    @NameInMap("AttachmentKey")
    public String attachmentKey;

    @NameInMap("Tid")
    public Long tid;

    public static CreateDataImportOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataImportOrderRequest self = new CreateDataImportOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataImportOrderRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateDataImportOrderRequest setRelatedUserList(java.util.List<Long> relatedUserList) {
        this.relatedUserList = relatedUserList;
        return this;
    }
    public java.util.List<Long> getRelatedUserList() {
        return this.relatedUserList;
    }

    public CreateDataImportOrderRequest setParam(CreateDataImportOrderRequestParam param) {
        this.param = param;
        return this;
    }
    public CreateDataImportOrderRequestParam getParam() {
        return this.param;
    }

    public CreateDataImportOrderRequest setAttachmentKey(String attachmentKey) {
        this.attachmentKey = attachmentKey;
        return this;
    }
    public String getAttachmentKey() {
        return this.attachmentKey;
    }

    public CreateDataImportOrderRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class CreateDataImportOrderRequestParamDbItemList extends TeaModel {
        @NameInMap("DbId")
        public Long dbId;

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
        @NameInMap("Classify")
        public String classify;

        @NameInMap("AttachmentName")
        public String attachmentName;

        @NameInMap("DbItemList")
        public java.util.List<CreateDataImportOrderRequestParamDbItemList> dbItemList;

        @NameInMap("FileType")
        public String fileType;

        @NameInMap("FileEncoding")
        public String fileEncoding;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("InsertType")
        public String insertType;

        @NameInMap("CsvFirstRowIsColumnDef")
        public Boolean csvFirstRowIsColumnDef;

        @NameInMap("IgnoreError")
        public Boolean ignoreError;

        @NameInMap("ImportMode")
        public String importMode;

        @NameInMap("RollbackSQL")
        public String rollbackSQL;

        @NameInMap("RollbackAttachmentName")
        public String rollbackAttachmentName;

        @NameInMap("RollbackSqlType")
        public String rollbackSqlType;

        public static CreateDataImportOrderRequestParam build(java.util.Map<String, ?> map) throws Exception {
            CreateDataImportOrderRequestParam self = new CreateDataImportOrderRequestParam();
            return TeaModel.build(map, self);
        }

        public CreateDataImportOrderRequestParam setClassify(String classify) {
            this.classify = classify;
            return this;
        }
        public String getClassify() {
            return this.classify;
        }

        public CreateDataImportOrderRequestParam setAttachmentName(String attachmentName) {
            this.attachmentName = attachmentName;
            return this;
        }
        public String getAttachmentName() {
            return this.attachmentName;
        }

        public CreateDataImportOrderRequestParam setDbItemList(java.util.List<CreateDataImportOrderRequestParamDbItemList> dbItemList) {
            this.dbItemList = dbItemList;
            return this;
        }
        public java.util.List<CreateDataImportOrderRequestParamDbItemList> getDbItemList() {
            return this.dbItemList;
        }

        public CreateDataImportOrderRequestParam setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public CreateDataImportOrderRequestParam setFileEncoding(String fileEncoding) {
            this.fileEncoding = fileEncoding;
            return this;
        }
        public String getFileEncoding() {
            return this.fileEncoding;
        }

        public CreateDataImportOrderRequestParam setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public CreateDataImportOrderRequestParam setInsertType(String insertType) {
            this.insertType = insertType;
            return this;
        }
        public String getInsertType() {
            return this.insertType;
        }

        public CreateDataImportOrderRequestParam setCsvFirstRowIsColumnDef(Boolean csvFirstRowIsColumnDef) {
            this.csvFirstRowIsColumnDef = csvFirstRowIsColumnDef;
            return this;
        }
        public Boolean getCsvFirstRowIsColumnDef() {
            return this.csvFirstRowIsColumnDef;
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

        public CreateDataImportOrderRequestParam setRollbackSQL(String rollbackSQL) {
            this.rollbackSQL = rollbackSQL;
            return this;
        }
        public String getRollbackSQL() {
            return this.rollbackSQL;
        }

        public CreateDataImportOrderRequestParam setRollbackAttachmentName(String rollbackAttachmentName) {
            this.rollbackAttachmentName = rollbackAttachmentName;
            return this;
        }
        public String getRollbackAttachmentName() {
            return this.rollbackAttachmentName;
        }

        public CreateDataImportOrderRequestParam setRollbackSqlType(String rollbackSqlType) {
            this.rollbackSqlType = rollbackSqlType;
            return this;
        }
        public String getRollbackSqlType() {
            return this.rollbackSqlType;
        }

    }

}
