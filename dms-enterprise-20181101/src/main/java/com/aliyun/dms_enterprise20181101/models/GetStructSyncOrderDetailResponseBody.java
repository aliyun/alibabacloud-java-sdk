// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetStructSyncOrderDetailResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4E1D2B4D-3E53-4ABC-999D-1D2520B3471A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the schema synchronization ticket.</p>
     */
    @NameInMap("StructSyncOrderDetail")
    public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetail structSyncOrderDetail;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetStructSyncOrderDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStructSyncOrderDetailResponseBody self = new GetStructSyncOrderDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStructSyncOrderDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetStructSyncOrderDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetStructSyncOrderDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStructSyncOrderDetailResponseBody setStructSyncOrderDetail(GetStructSyncOrderDetailResponseBodyStructSyncOrderDetail structSyncOrderDetail) {
        this.structSyncOrderDetail = structSyncOrderDetail;
        return this;
    }
    public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetail getStructSyncOrderDetail() {
        return this.structSyncOrderDetail;
    }

    public GetStructSyncOrderDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailSourceDatabaseInfo extends TeaModel {
        /**
         * <p>The ID of the source database.</p>
         * 
         * <strong>example:</strong>
         * <p>432532</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>The type of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The type of the environment to which the database instance belongs. For more information, see <a href="https://help.aliyun.com/document_detail/163309.html">Change the environment type of an instance</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>Indicates whether the database is a logical database. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The database is a logical database.</li>
         * <li><strong>false</strong>: The database is not a logical database</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        /**
         * <p>The name that is used to search for the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SearchName")
        public String searchName;

        public static GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailSourceDatabaseInfo build(java.util.Map<String, ?> map) throws Exception {
            GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailSourceDatabaseInfo self = new GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailSourceDatabaseInfo();
            return TeaModel.build(map, self);
        }

        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailSourceDatabaseInfo setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailSourceDatabaseInfo setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailSourceDatabaseInfo setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailSourceDatabaseInfo setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailSourceDatabaseInfo setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

    }

    public static class GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailSourceVersionInfo extends TeaModel {
        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>e179bbb8163dcdcfacda24858bedb4d8006ae2b8</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        public static GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailSourceVersionInfo build(java.util.Map<String, ?> map) throws Exception {
            GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailSourceVersionInfo self = new GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailSourceVersionInfo();
            return TeaModel.build(map, self);
        }

        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailSourceVersionInfo setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

    public static class GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTableInfoList extends TeaModel {
        /**
         * <p>The name of the table whose schema you want to synchronize.</p>
         * 
         * <strong>example:</strong>
         * <p>test_tbl</p>
         */
        @NameInMap("SourceTableName")
        public String sourceTableName;

        /**
         * <p>The name of the table to which you want to synchronize the schema of a table.</p>
         * 
         * <strong>example:</strong>
         * <p>test_tbl</p>
         */
        @NameInMap("TargetTableName")
        public String targetTableName;

        public static GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTableInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTableInfoList self = new GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTableInfoList();
            return TeaModel.build(map, self);
        }

        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTableInfoList setSourceTableName(String sourceTableName) {
            this.sourceTableName = sourceTableName;
            return this;
        }
        public String getSourceTableName() {
            return this.sourceTableName;
        }

        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTableInfoList setTargetTableName(String targetTableName) {
            this.targetTableName = targetTableName;
            return this;
        }
        public String getTargetTableName() {
            return this.targetTableName;
        }

    }

    public static class GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTargetDatabaseInfo extends TeaModel {
        /**
         * <p>The ID of the destination database.</p>
         * 
         * <strong>example:</strong>
         * <p>432543</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>The type of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The type of the environment to which the database instance belongs. For more information, see <a href="https://help.aliyun.com/document_detail/163309.html">Change the environment type of an instance</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>Indicates whether the database is a logical database. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The database is a logical database.</li>
         * <li><strong>false</strong>: The database is not a logical database</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        /**
         * <p>The name that is used to search for the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SearchName")
        public String searchName;

        public static GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTargetDatabaseInfo build(java.util.Map<String, ?> map) throws Exception {
            GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTargetDatabaseInfo self = new GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTargetDatabaseInfo();
            return TeaModel.build(map, self);
        }

        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTargetDatabaseInfo setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTargetDatabaseInfo setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTargetDatabaseInfo setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTargetDatabaseInfo setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTargetDatabaseInfo setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

    }

    public static class GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTargetVersionInfo extends TeaModel {
        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>e179bbb8163dcdcfacda24858bedb4d8006ae2b8</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        public static GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTargetVersionInfo build(java.util.Map<String, ?> map) throws Exception {
            GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTargetVersionInfo self = new GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTargetVersionInfo();
            return TeaModel.build(map, self);
        }

        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTargetVersionInfo setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

    public static class GetStructSyncOrderDetailResponseBodyStructSyncOrderDetail extends TeaModel {
        /**
         * <p>Indicates whether to skip errors. Valid values:</p>
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
         * <p>The information about the source database.</p>
         */
        @NameInMap("SourceDatabaseInfo")
        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailSourceDatabaseInfo sourceDatabaseInfo;

        /**
         * <p>The schema version of the source database. Valid values:</p>
         * <ul>
         * <li><strong>DATASOURCE</strong>: the default latest version of the system</li>
         * <li><strong>VERSION</strong>: a previous schema version that you manually specify</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VERSION</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The version information about the source instance.</p>
         * <blockquote>
         * <p>This parameter is displayed only when the value of the <strong>SourceType</strong> parameter is <strong>VERSION</strong>.</p>
         * </blockquote>
         */
        @NameInMap("SourceVersionInfo")
        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailSourceVersionInfo sourceVersionInfo;

        /**
         * <p>The information about the table whose schema you want to synchronize.</p>
         */
        @NameInMap("TableInfoList")
        public java.util.List<GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTableInfoList> tableInfoList;

        /**
         * <p>The information about the destination database.</p>
         */
        @NameInMap("TargetDatabaseInfo")
        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTargetDatabaseInfo targetDatabaseInfo;

        /**
         * <p>The schema version of the destination database. Valid values:</p>
         * <ul>
         * <li><strong>DATASOURCE</strong>: the default latest version of the system</li>
         * <li><strong>VERSION</strong>: a previous schema version that you manually specify</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DATASOURCE</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The version information about the destination instance.</p>
         * <blockquote>
         * <p>This parameter is displayed only when the value of the <strong>SourceType</strong> parameter is <strong>VERSION</strong>.</p>
         * </blockquote>
         */
        @NameInMap("TargetVersionInfo")
        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTargetVersionInfo targetVersionInfo;

        public static GetStructSyncOrderDetailResponseBodyStructSyncOrderDetail build(java.util.Map<String, ?> map) throws Exception {
            GetStructSyncOrderDetailResponseBodyStructSyncOrderDetail self = new GetStructSyncOrderDetailResponseBodyStructSyncOrderDetail();
            return TeaModel.build(map, self);
        }

        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetail setIgnoreError(Boolean ignoreError) {
            this.ignoreError = ignoreError;
            return this;
        }
        public Boolean getIgnoreError() {
            return this.ignoreError;
        }

        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetail setSourceDatabaseInfo(GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailSourceDatabaseInfo sourceDatabaseInfo) {
            this.sourceDatabaseInfo = sourceDatabaseInfo;
            return this;
        }
        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailSourceDatabaseInfo getSourceDatabaseInfo() {
            return this.sourceDatabaseInfo;
        }

        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetail setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetail setSourceVersionInfo(GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailSourceVersionInfo sourceVersionInfo) {
            this.sourceVersionInfo = sourceVersionInfo;
            return this;
        }
        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailSourceVersionInfo getSourceVersionInfo() {
            return this.sourceVersionInfo;
        }

        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetail setTableInfoList(java.util.List<GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTableInfoList> tableInfoList) {
            this.tableInfoList = tableInfoList;
            return this;
        }
        public java.util.List<GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTableInfoList> getTableInfoList() {
            return this.tableInfoList;
        }

        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetail setTargetDatabaseInfo(GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTargetDatabaseInfo targetDatabaseInfo) {
            this.targetDatabaseInfo = targetDatabaseInfo;
            return this;
        }
        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTargetDatabaseInfo getTargetDatabaseInfo() {
            return this.targetDatabaseInfo;
        }

        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetail setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetail setTargetVersionInfo(GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTargetVersionInfo targetVersionInfo) {
            this.targetVersionInfo = targetVersionInfo;
            return this;
        }
        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTargetVersionInfo getTargetVersionInfo() {
            return this.targetVersionInfo;
        }

    }

}
