// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListTablesResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of the backend exception.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The paged query result.</p>
     */
    @NameInMap("PageResult")
    public ListTablesResponseBodyPageResult pageResult;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTablesResponseBody self = new ListTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTablesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTablesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTablesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTablesResponseBody setPageResult(ListTablesResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListTablesResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTablesResponseBodyPageResultTableListStreamTableConfig extends TeaModel {
        /**
         * <p>The configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTablesResponseBodyPageResultTableListStreamTableConfig build(java.util.Map<String, ?> map) throws Exception {
            ListTablesResponseBodyPageResultTableListStreamTableConfig self = new ListTablesResponseBodyPageResultTableListStreamTableConfig();
            return TeaModel.build(map, self);
        }

        public ListTablesResponseBodyPageResultTableListStreamTableConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTablesResponseBodyPageResultTableListStreamTableConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListTablesResponseBodyPageResultTableList extends TeaModel {
        /**
         * <p>The asset inventory tags.</p>
         */
        @NameInMap("AssetTagList")
        public java.util.List<String> assetTagList;

        /**
         * <p>The ID of the business unit.</p>
         * 
         * <strong>example:</strong>
         * <p>2011</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <p>The name of the business unit.</p>
         * 
         * <strong>example:</strong>
         * <p>LD_test01</p>
         */
        @NameInMap("BizUnitName")
        public String bizUnitName;

        /**
         * <p>The comment of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>30011211</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The ID of the data domain.</p>
         * 
         * <strong>example:</strong>
         * <p>211</p>
         */
        @NameInMap("DataDomainId")
        public Long dataDomainId;

        /**
         * <p>The name of the data domain.</p>
         * 
         * <strong>example:</strong>
         * <p>211</p>
         */
        @NameInMap("DataDomainName")
        public String dataDomainName;

        /**
         * <p>The ID of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>3301</p>
         */
        @NameInMap("DataSourceId")
        public Long dataSourceId;

        /**
         * <p>The display name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>学生</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The environment. Valid values:</p>
         * <ul>
         * <li>dev</li>
         * <li>prod.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>The file ID. This value is used to navigate to the ODM model.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The GUID of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>10011</p>
         */
        @NameInMap("Guid")
        public String guid;

        /**
         * <p>Indicates whether the project or business version to which the table belongs is in Basic mode.</p>
         */
        @NameInMap("IsBasicMode")
        public Boolean isBasicMode;

        /**
         * <p>Indicates whether the table is a partitioned table.</p>
         */
        @NameInMap("IsPartitionTable")
        public Boolean isPartitionTable;

        /**
         * <p>The time when the table DDL was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("LastDdlTime")
        public String lastDdlTime;

        /**
         * <p>The time when the table data was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("LastDmlTime")
        public String lastDmlTime;

        /**
         * <p>The time when the data was last viewed.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("LastQueryTime")
        public String lastQueryTime;

        /**
         * <p>The lifecycle of the table, in days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("LifeCycle")
        public Long lifeCycle;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>t_test01</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The Dataphin user ID of the table owner. This value may be empty if the owner is not bound.</p>
         * 
         * <strong>example:</strong>
         * <p>30011211</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the parent model. This value is used to navigate to the ODM model.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ParentModelId")
        public String parentModelId;

        /**
         * <p>The ID of the logical project.</p>
         * 
         * <strong>example:</strong>
         * <p>1011</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The name of the logical project.</p>
         * 
         * <strong>example:</strong>
         * <p>testPrj</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The security classification.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SecurityLevel")
        public Long securityLevel;

        /**
         * <p>The abbreviation of the security classification name.</p>
         * 
         * <strong>example:</strong>
         * <p>高级</p>
         */
        @NameInMap("SecurityLevelAbbreviation")
        public String securityLevelAbbreviation;

        /**
         * <p>The name of the security classification.</p>
         * 
         * <strong>example:</strong>
         * <p>高级</p>
         */
        @NameInMap("SecurityLevelName")
        public String securityLevelName;

        /**
         * <p>The storage type. Valid values:</p>
         * <ul>
         * <li>HIVE</li>
         * <li>MAX_COMPUTE.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HIVE</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The dynamic properties of the real-time meta table.</p>
         */
        @NameInMap("StreamTableConfig")
        public java.util.List<ListTablesResponseBodyPageResultTableListStreamTableConfig> streamTableConfig;

        /**
         * <p>The total storage size of the table, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>10241024</p>
         */
        @NameInMap("TableSizeInBytes")
        public Long tableSizeInBytes;

        /**
         * <p>The number of visits in the last 30 days.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("VisitCount30d")
        public Long visitCount30d;

        public static ListTablesResponseBodyPageResultTableList build(java.util.Map<String, ?> map) throws Exception {
            ListTablesResponseBodyPageResultTableList self = new ListTablesResponseBodyPageResultTableList();
            return TeaModel.build(map, self);
        }

        public ListTablesResponseBodyPageResultTableList setAssetTagList(java.util.List<String> assetTagList) {
            this.assetTagList = assetTagList;
            return this;
        }
        public java.util.List<String> getAssetTagList() {
            return this.assetTagList;
        }

        public ListTablesResponseBodyPageResultTableList setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public ListTablesResponseBodyPageResultTableList setBizUnitName(String bizUnitName) {
            this.bizUnitName = bizUnitName;
            return this;
        }
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        public ListTablesResponseBodyPageResultTableList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListTablesResponseBodyPageResultTableList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTablesResponseBodyPageResultTableList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListTablesResponseBodyPageResultTableList setDataDomainId(Long dataDomainId) {
            this.dataDomainId = dataDomainId;
            return this;
        }
        public Long getDataDomainId() {
            return this.dataDomainId;
        }

        public ListTablesResponseBodyPageResultTableList setDataDomainName(String dataDomainName) {
            this.dataDomainName = dataDomainName;
            return this;
        }
        public String getDataDomainName() {
            return this.dataDomainName;
        }

        public ListTablesResponseBodyPageResultTableList setDataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

        public ListTablesResponseBodyPageResultTableList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListTablesResponseBodyPageResultTableList setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public ListTablesResponseBodyPageResultTableList setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public ListTablesResponseBodyPageResultTableList setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public ListTablesResponseBodyPageResultTableList setIsBasicMode(Boolean isBasicMode) {
            this.isBasicMode = isBasicMode;
            return this;
        }
        public Boolean getIsBasicMode() {
            return this.isBasicMode;
        }

        public ListTablesResponseBodyPageResultTableList setIsPartitionTable(Boolean isPartitionTable) {
            this.isPartitionTable = isPartitionTable;
            return this;
        }
        public Boolean getIsPartitionTable() {
            return this.isPartitionTable;
        }

        public ListTablesResponseBodyPageResultTableList setLastDdlTime(String lastDdlTime) {
            this.lastDdlTime = lastDdlTime;
            return this;
        }
        public String getLastDdlTime() {
            return this.lastDdlTime;
        }

        public ListTablesResponseBodyPageResultTableList setLastDmlTime(String lastDmlTime) {
            this.lastDmlTime = lastDmlTime;
            return this;
        }
        public String getLastDmlTime() {
            return this.lastDmlTime;
        }

        public ListTablesResponseBodyPageResultTableList setLastQueryTime(String lastQueryTime) {
            this.lastQueryTime = lastQueryTime;
            return this;
        }
        public String getLastQueryTime() {
            return this.lastQueryTime;
        }

        public ListTablesResponseBodyPageResultTableList setLifeCycle(Long lifeCycle) {
            this.lifeCycle = lifeCycle;
            return this;
        }
        public Long getLifeCycle() {
            return this.lifeCycle;
        }

        public ListTablesResponseBodyPageResultTableList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTablesResponseBodyPageResultTableList setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListTablesResponseBodyPageResultTableList setParentModelId(String parentModelId) {
            this.parentModelId = parentModelId;
            return this;
        }
        public String getParentModelId() {
            return this.parentModelId;
        }

        public ListTablesResponseBodyPageResultTableList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListTablesResponseBodyPageResultTableList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListTablesResponseBodyPageResultTableList setSecurityLevel(Long securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Long getSecurityLevel() {
            return this.securityLevel;
        }

        public ListTablesResponseBodyPageResultTableList setSecurityLevelAbbreviation(String securityLevelAbbreviation) {
            this.securityLevelAbbreviation = securityLevelAbbreviation;
            return this;
        }
        public String getSecurityLevelAbbreviation() {
            return this.securityLevelAbbreviation;
        }

        public ListTablesResponseBodyPageResultTableList setSecurityLevelName(String securityLevelName) {
            this.securityLevelName = securityLevelName;
            return this;
        }
        public String getSecurityLevelName() {
            return this.securityLevelName;
        }

        public ListTablesResponseBodyPageResultTableList setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public ListTablesResponseBodyPageResultTableList setStreamTableConfig(java.util.List<ListTablesResponseBodyPageResultTableListStreamTableConfig> streamTableConfig) {
            this.streamTableConfig = streamTableConfig;
            return this;
        }
        public java.util.List<ListTablesResponseBodyPageResultTableListStreamTableConfig> getStreamTableConfig() {
            return this.streamTableConfig;
        }

        public ListTablesResponseBodyPageResultTableList setTableSizeInBytes(Long tableSizeInBytes) {
            this.tableSizeInBytes = tableSizeInBytes;
            return this;
        }
        public Long getTableSizeInBytes() {
            return this.tableSizeInBytes;
        }

        public ListTablesResponseBodyPageResultTableList setVisitCount30d(Long visitCount30d) {
            this.visitCount30d = visitCount30d;
            return this;
        }
        public Long getVisitCount30d() {
            return this.visitCount30d;
        }

    }

    public static class ListTablesResponseBodyPageResult extends TeaModel {
        /**
         * <p>The list of tables.</p>
         */
        @NameInMap("TableList")
        public java.util.List<ListTablesResponseBodyPageResultTableList> tableList;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListTablesResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListTablesResponseBodyPageResult self = new ListTablesResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListTablesResponseBodyPageResult setTableList(java.util.List<ListTablesResponseBodyPageResultTableList> tableList) {
            this.tableList = tableList;
            return this;
        }
        public java.util.List<ListTablesResponseBodyPageResultTableList> getTableList() {
            return this.tableList;
        }

        public ListTablesResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
