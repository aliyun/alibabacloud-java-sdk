// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateStructSyncOrderRequest extends TeaModel {
    /**
     * <p>The key of an attachment that is returned after the attachment is uploaded. You can call the [GetUserUploadFileJob](https://help.aliyun.com/document_detail/206069.html) operation to query the key of the attachment.</p>
     */
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    /**
     * <p>The remarks of the ticket.</p>
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
    public CreateStructSyncOrderRequestParam param;

    /**
     * <p>The IDs of the stakeholders.</p>
     */
    @NameInMap("RelatedUserList")
    public java.util.List<Long> relatedUserList;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>>  To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the DMS console. For more information, see [Manage DMS tenants](https://help.aliyun.com/document_detail/181330.html).</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static CreateStructSyncOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStructSyncOrderRequest self = new CreateStructSyncOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateStructSyncOrderRequest setAttachmentKey(String attachmentKey) {
        this.attachmentKey = attachmentKey;
        return this;
    }
    public String getAttachmentKey() {
        return this.attachmentKey;
    }

    public CreateStructSyncOrderRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateStructSyncOrderRequest setParam(CreateStructSyncOrderRequestParam param) {
        this.param = param;
        return this;
    }
    public CreateStructSyncOrderRequestParam getParam() {
        return this.param;
    }

    public CreateStructSyncOrderRequest setRelatedUserList(java.util.List<Long> relatedUserList) {
        this.relatedUserList = relatedUserList;
        return this;
    }
    public java.util.List<Long> getRelatedUserList() {
        return this.relatedUserList;
    }

    public CreateStructSyncOrderRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class CreateStructSyncOrderRequestParamSource extends TeaModel {
        /**
         * <p>The ID of the database. You can call the [SearchDatabases](https://help.aliyun.com/document_detail/141876.html) operation to query the ID of the database.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>The name that is used to search for the database. You can call the [SearchDatabases](https://help.aliyun.com/document_detail/141876.html) operation to query the name of the database.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("DbSearchName")
        public String dbSearchName;

        /**
         * <p>Specifies whether the database is a logical database. Valid values:</p>
         * <br>
         * <p>*   **true**: The database is a logical database.</p>
         * <p>*   **false**: The database is not a logical database.</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        /**
         * <p>The version number of the schema. The default value is the latest schema version number. For more information, see [Manage schema versions](https://help.aliyun.com/document_detail/202275.html).</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        public static CreateStructSyncOrderRequestParamSource build(java.util.Map<String, ?> map) throws Exception {
            CreateStructSyncOrderRequestParamSource self = new CreateStructSyncOrderRequestParamSource();
            return TeaModel.build(map, self);
        }

        public CreateStructSyncOrderRequestParamSource setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public CreateStructSyncOrderRequestParamSource setDbSearchName(String dbSearchName) {
            this.dbSearchName = dbSearchName;
            return this;
        }
        public String getDbSearchName() {
            return this.dbSearchName;
        }

        public CreateStructSyncOrderRequestParamSource setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public CreateStructSyncOrderRequestParamSource setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

    public static class CreateStructSyncOrderRequestParamTableInfoList extends TeaModel {
        /**
         * <p>The name of the source table.</p>
         */
        @NameInMap("SourceTableName")
        public String sourceTableName;

        /**
         * <p>The name of the destination table.</p>
         */
        @NameInMap("TargetTableName")
        public String targetTableName;

        public static CreateStructSyncOrderRequestParamTableInfoList build(java.util.Map<String, ?> map) throws Exception {
            CreateStructSyncOrderRequestParamTableInfoList self = new CreateStructSyncOrderRequestParamTableInfoList();
            return TeaModel.build(map, self);
        }

        public CreateStructSyncOrderRequestParamTableInfoList setSourceTableName(String sourceTableName) {
            this.sourceTableName = sourceTableName;
            return this;
        }
        public String getSourceTableName() {
            return this.sourceTableName;
        }

        public CreateStructSyncOrderRequestParamTableInfoList setTargetTableName(String targetTableName) {
            this.targetTableName = targetTableName;
            return this;
        }
        public String getTargetTableName() {
            return this.targetTableName;
        }

    }

    public static class CreateStructSyncOrderRequestParamTarget extends TeaModel {
        /**
         * <p>The ID of the database. You can call the [SearchDatabases](https://help.aliyun.com/document_detail/141876.html) operation to query the ID of the database.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>The name that is used to search for the database. You can call the [SearchDatabases](https://help.aliyun.com/document_detail/141876.html) operation to query the name of the database.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("DbSearchName")
        public String dbSearchName;

        /**
         * <p>Specifies whether the database is a logical database. Valid values:</p>
         * <br>
         * <p>*   **true**: The database is a logical database.</p>
         * <p>*   **false**: The database is not a logical database.</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        /**
         * <p>The version number. By default, this parameter is left empty.</p>
         * <br>
         * <p>>  If you specify the schema version number of the destination database, Data Management (DMS) only compares the schemas of the two databases.</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        public static CreateStructSyncOrderRequestParamTarget build(java.util.Map<String, ?> map) throws Exception {
            CreateStructSyncOrderRequestParamTarget self = new CreateStructSyncOrderRequestParamTarget();
            return TeaModel.build(map, self);
        }

        public CreateStructSyncOrderRequestParamTarget setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public CreateStructSyncOrderRequestParamTarget setDbSearchName(String dbSearchName) {
            this.dbSearchName = dbSearchName;
            return this;
        }
        public String getDbSearchName() {
            return this.dbSearchName;
        }

        public CreateStructSyncOrderRequestParamTarget setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public CreateStructSyncOrderRequestParamTarget setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

    public static class CreateStructSyncOrderRequestParam extends TeaModel {
        /**
         * <p>Specifies whether to skip an error that occurs in executing an SQL statement. Valid values:</p>
         * <br>
         * <p>*   **true**: continues to execute subsequent SQL statements if an error occurs in executing an SQL statement.</p>
         * <p>*   **false**: stops executing subsequent SQL statements if an error occurs in executing an SQL statement.</p>
         */
        @NameInMap("IgnoreError")
        public Boolean ignoreError;

        /**
         * <p>The information about the base database.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Source")
        public CreateStructSyncOrderRequestParamSource source;

        /**
         * <p>The information about the table of which you want to synchronize the schema.</p>
         */
        @NameInMap("TableInfoList")
        public java.util.List<CreateStructSyncOrderRequestParamTableInfoList> tableInfoList;

        /**
         * <p>The information about the database to which you want to synchronize the schema of a table.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Target")
        public CreateStructSyncOrderRequestParamTarget target;

        public static CreateStructSyncOrderRequestParam build(java.util.Map<String, ?> map) throws Exception {
            CreateStructSyncOrderRequestParam self = new CreateStructSyncOrderRequestParam();
            return TeaModel.build(map, self);
        }

        public CreateStructSyncOrderRequestParam setIgnoreError(Boolean ignoreError) {
            this.ignoreError = ignoreError;
            return this;
        }
        public Boolean getIgnoreError() {
            return this.ignoreError;
        }

        public CreateStructSyncOrderRequestParam setSource(CreateStructSyncOrderRequestParamSource source) {
            this.source = source;
            return this;
        }
        public CreateStructSyncOrderRequestParamSource getSource() {
            return this.source;
        }

        public CreateStructSyncOrderRequestParam setTableInfoList(java.util.List<CreateStructSyncOrderRequestParamTableInfoList> tableInfoList) {
            this.tableInfoList = tableInfoList;
            return this;
        }
        public java.util.List<CreateStructSyncOrderRequestParamTableInfoList> getTableInfoList() {
            return this.tableInfoList;
        }

        public CreateStructSyncOrderRequestParam setTarget(CreateStructSyncOrderRequestParamTarget target) {
            this.target = target;
            return this;
        }
        public CreateStructSyncOrderRequestParamTarget getTarget() {
            return this.target;
        }

    }

}
