// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetStructSyncOrderDetailResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("StructSyncOrderDetail")
    public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetail structSyncOrderDetail;

    public static GetStructSyncOrderDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStructSyncOrderDetailResponseBody self = new GetStructSyncOrderDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStructSyncOrderDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStructSyncOrderDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetStructSyncOrderDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetStructSyncOrderDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetStructSyncOrderDetailResponseBody setStructSyncOrderDetail(GetStructSyncOrderDetailResponseBodyStructSyncOrderDetail structSyncOrderDetail) {
        this.structSyncOrderDetail = structSyncOrderDetail;
        return this;
    }
    public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetail getStructSyncOrderDetail() {
        return this.structSyncOrderDetail;
    }

    public static class GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailSourceDatabaseInfo extends TeaModel {
        @NameInMap("DbId")
        public Long dbId;

        @NameInMap("SearchName")
        public String searchName;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("Logic")
        public Boolean logic;

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

        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailSourceDatabaseInfo setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
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

    }

    public static class GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTargetDatabaseInfo extends TeaModel {
        @NameInMap("DbId")
        public Long dbId;

        @NameInMap("SearchName")
        public String searchName;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("Logic")
        public Boolean logic;

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

        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTargetDatabaseInfo setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
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

    }

    public static class GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailSourceVersionInfo extends TeaModel {
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

    public static class GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTargetVersionInfo extends TeaModel {
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

    public static class GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTableInfoList extends TeaModel {
        @NameInMap("SourceTableName")
        public String sourceTableName;

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

    public static class GetStructSyncOrderDetailResponseBodyStructSyncOrderDetail extends TeaModel {
        @NameInMap("SourceDatabaseInfo")
        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailSourceDatabaseInfo sourceDatabaseInfo;

        @NameInMap("TargetDatabaseInfo")
        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTargetDatabaseInfo targetDatabaseInfo;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("SourceVersionInfo")
        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailSourceVersionInfo sourceVersionInfo;

        @NameInMap("TargetType")
        public String targetType;

        @NameInMap("TargetVersionInfo")
        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTargetVersionInfo targetVersionInfo;

        @NameInMap("TableInfoList")
        public java.util.List<GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTableInfoList> tableInfoList;

        @NameInMap("IgnoreError")
        public Boolean ignoreError;

        public static GetStructSyncOrderDetailResponseBodyStructSyncOrderDetail build(java.util.Map<String, ?> map) throws Exception {
            GetStructSyncOrderDetailResponseBodyStructSyncOrderDetail self = new GetStructSyncOrderDetailResponseBodyStructSyncOrderDetail();
            return TeaModel.build(map, self);
        }

        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetail setSourceDatabaseInfo(GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailSourceDatabaseInfo sourceDatabaseInfo) {
            this.sourceDatabaseInfo = sourceDatabaseInfo;
            return this;
        }
        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailSourceDatabaseInfo getSourceDatabaseInfo() {
            return this.sourceDatabaseInfo;
        }

        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetail setTargetDatabaseInfo(GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTargetDatabaseInfo targetDatabaseInfo) {
            this.targetDatabaseInfo = targetDatabaseInfo;
            return this;
        }
        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTargetDatabaseInfo getTargetDatabaseInfo() {
            return this.targetDatabaseInfo;
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

        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetail setTableInfoList(java.util.List<GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTableInfoList> tableInfoList) {
            this.tableInfoList = tableInfoList;
            return this;
        }
        public java.util.List<GetStructSyncOrderDetailResponseBodyStructSyncOrderDetailTableInfoList> getTableInfoList() {
            return this.tableInfoList;
        }

        public GetStructSyncOrderDetailResponseBodyStructSyncOrderDetail setIgnoreError(Boolean ignoreError) {
            this.ignoreError = ignoreError;
            return this;
        }
        public Boolean getIgnoreError() {
            return this.ignoreError;
        }

    }

}
