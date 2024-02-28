// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetTableInfoResponseBody extends TeaModel {
    @NameInMap("data")
    public GetTableInfoResponseBodyData data;

    @NameInMap("requestId")
    public String requestId;

    public static GetTableInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableInfoResponseBody self = new GetTableInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableInfoResponseBody setData(GetTableInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTableInfoResponseBodyData getData() {
        return this.data;
    }

    public GetTableInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTableInfoResponseBodyDataNativeColumns extends TeaModel {
        @NameInMap("comment")
        public String comment;

        @NameInMap("label")
        public String label;

        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

        public static GetTableInfoResponseBodyDataNativeColumns build(java.util.Map<String, ?> map) throws Exception {
            GetTableInfoResponseBodyDataNativeColumns self = new GetTableInfoResponseBodyDataNativeColumns();
            return TeaModel.build(map, self);
        }

        public GetTableInfoResponseBodyDataNativeColumns setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetTableInfoResponseBodyDataNativeColumns setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetTableInfoResponseBodyDataNativeColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTableInfoResponseBodyDataNativeColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTableInfoResponseBodyDataPartitionColumns extends TeaModel {
        @NameInMap("comment")
        public String comment;

        @NameInMap("label")
        public String label;

        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

        public static GetTableInfoResponseBodyDataPartitionColumns build(java.util.Map<String, ?> map) throws Exception {
            GetTableInfoResponseBodyDataPartitionColumns self = new GetTableInfoResponseBodyDataPartitionColumns();
            return TeaModel.build(map, self);
        }

        public GetTableInfoResponseBodyDataPartitionColumns setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetTableInfoResponseBodyDataPartitionColumns setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetTableInfoResponseBodyDataPartitionColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTableInfoResponseBodyDataPartitionColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTableInfoResponseBodyData extends TeaModel {
        @NameInMap("autoRefreshEnabled")
        public Boolean autoRefreshEnabled;

        @NameInMap("comment")
        public String comment;

        @NameInMap("createTableDDL")
        public String createTableDDL;

        @NameInMap("creationTime")
        public Long creationTime;

        @NameInMap("displayName")
        public String displayName;

        @NameInMap("fileNum")
        public Long fileNum;

        @NameInMap("isExternalTable")
        public Boolean isExternalTable;

        @NameInMap("isOutdated")
        public Boolean isOutdated;

        @NameInMap("lastAccessTime")
        public Long lastAccessTime;

        @NameInMap("lastDDLTime")
        public Long lastDDLTime;

        @NameInMap("lastModifiedTime")
        public Long lastModifiedTime;

        @NameInMap("lifecycle")
        public String lifecycle;

        @NameInMap("location")
        public String location;

        @NameInMap("materializedView")
        public Boolean materializedView;

        @NameInMap("name")
        public String name;

        @NameInMap("nativeColumns")
        public java.util.List<GetTableInfoResponseBodyDataNativeColumns> nativeColumns;

        @NameInMap("odpsPropertiesRolearn")
        public String odpsPropertiesRolearn;

        @NameInMap("odpsSqlTextOptionFlushHeader")
        public Boolean odpsSqlTextOptionFlushHeader;

        @NameInMap("odpsTextOptionHeaderLinesCount")
        public Long odpsTextOptionHeaderLinesCount;

        @NameInMap("owner")
        public String owner;

        @NameInMap("partitionColumns")
        public java.util.List<GetTableInfoResponseBodyDataPartitionColumns> partitionColumns;

        @NameInMap("physicalSize")
        public Long physicalSize;

        @NameInMap("projectName")
        public String projectName;

        @NameInMap("rewriteEnabled")
        public Boolean rewriteEnabled;

        @NameInMap("schema")
        public String schema;

        @NameInMap("size")
        public Long size;

        @NameInMap("storageHandler")
        public String storageHandler;

        @NameInMap("tableLabel")
        public String tableLabel;

        @NameInMap("tablesotreTableName")
        public String tablesotreTableName;

        @NameInMap("tablestoreColumnsMapping")
        public String tablestoreColumnsMapping;

        @NameInMap("type")
        public String type;

        @NameInMap("viewText")
        public String viewText;

        public static GetTableInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTableInfoResponseBodyData self = new GetTableInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTableInfoResponseBodyData setAutoRefreshEnabled(Boolean autoRefreshEnabled) {
            this.autoRefreshEnabled = autoRefreshEnabled;
            return this;
        }
        public Boolean getAutoRefreshEnabled() {
            return this.autoRefreshEnabled;
        }

        public GetTableInfoResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetTableInfoResponseBodyData setCreateTableDDL(String createTableDDL) {
            this.createTableDDL = createTableDDL;
            return this;
        }
        public String getCreateTableDDL() {
            return this.createTableDDL;
        }

        public GetTableInfoResponseBodyData setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public GetTableInfoResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetTableInfoResponseBodyData setFileNum(Long fileNum) {
            this.fileNum = fileNum;
            return this;
        }
        public Long getFileNum() {
            return this.fileNum;
        }

        public GetTableInfoResponseBodyData setIsExternalTable(Boolean isExternalTable) {
            this.isExternalTable = isExternalTable;
            return this;
        }
        public Boolean getIsExternalTable() {
            return this.isExternalTable;
        }

        public GetTableInfoResponseBodyData setIsOutdated(Boolean isOutdated) {
            this.isOutdated = isOutdated;
            return this;
        }
        public Boolean getIsOutdated() {
            return this.isOutdated;
        }

        public GetTableInfoResponseBodyData setLastAccessTime(Long lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }
        public Long getLastAccessTime() {
            return this.lastAccessTime;
        }

        public GetTableInfoResponseBodyData setLastDDLTime(Long lastDDLTime) {
            this.lastDDLTime = lastDDLTime;
            return this;
        }
        public Long getLastDDLTime() {
            return this.lastDDLTime;
        }

        public GetTableInfoResponseBodyData setLastModifiedTime(Long lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public Long getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public GetTableInfoResponseBodyData setLifecycle(String lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }
        public String getLifecycle() {
            return this.lifecycle;
        }

        public GetTableInfoResponseBodyData setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetTableInfoResponseBodyData setMaterializedView(Boolean materializedView) {
            this.materializedView = materializedView;
            return this;
        }
        public Boolean getMaterializedView() {
            return this.materializedView;
        }

        public GetTableInfoResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTableInfoResponseBodyData setNativeColumns(java.util.List<GetTableInfoResponseBodyDataNativeColumns> nativeColumns) {
            this.nativeColumns = nativeColumns;
            return this;
        }
        public java.util.List<GetTableInfoResponseBodyDataNativeColumns> getNativeColumns() {
            return this.nativeColumns;
        }

        public GetTableInfoResponseBodyData setOdpsPropertiesRolearn(String odpsPropertiesRolearn) {
            this.odpsPropertiesRolearn = odpsPropertiesRolearn;
            return this;
        }
        public String getOdpsPropertiesRolearn() {
            return this.odpsPropertiesRolearn;
        }

        public GetTableInfoResponseBodyData setOdpsSqlTextOptionFlushHeader(Boolean odpsSqlTextOptionFlushHeader) {
            this.odpsSqlTextOptionFlushHeader = odpsSqlTextOptionFlushHeader;
            return this;
        }
        public Boolean getOdpsSqlTextOptionFlushHeader() {
            return this.odpsSqlTextOptionFlushHeader;
        }

        public GetTableInfoResponseBodyData setOdpsTextOptionHeaderLinesCount(Long odpsTextOptionHeaderLinesCount) {
            this.odpsTextOptionHeaderLinesCount = odpsTextOptionHeaderLinesCount;
            return this;
        }
        public Long getOdpsTextOptionHeaderLinesCount() {
            return this.odpsTextOptionHeaderLinesCount;
        }

        public GetTableInfoResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetTableInfoResponseBodyData setPartitionColumns(java.util.List<GetTableInfoResponseBodyDataPartitionColumns> partitionColumns) {
            this.partitionColumns = partitionColumns;
            return this;
        }
        public java.util.List<GetTableInfoResponseBodyDataPartitionColumns> getPartitionColumns() {
            return this.partitionColumns;
        }

        public GetTableInfoResponseBodyData setPhysicalSize(Long physicalSize) {
            this.physicalSize = physicalSize;
            return this;
        }
        public Long getPhysicalSize() {
            return this.physicalSize;
        }

        public GetTableInfoResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetTableInfoResponseBodyData setRewriteEnabled(Boolean rewriteEnabled) {
            this.rewriteEnabled = rewriteEnabled;
            return this;
        }
        public Boolean getRewriteEnabled() {
            return this.rewriteEnabled;
        }

        public GetTableInfoResponseBodyData setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public GetTableInfoResponseBodyData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetTableInfoResponseBodyData setStorageHandler(String storageHandler) {
            this.storageHandler = storageHandler;
            return this;
        }
        public String getStorageHandler() {
            return this.storageHandler;
        }

        public GetTableInfoResponseBodyData setTableLabel(String tableLabel) {
            this.tableLabel = tableLabel;
            return this;
        }
        public String getTableLabel() {
            return this.tableLabel;
        }

        public GetTableInfoResponseBodyData setTablesotreTableName(String tablesotreTableName) {
            this.tablesotreTableName = tablesotreTableName;
            return this;
        }
        public String getTablesotreTableName() {
            return this.tablesotreTableName;
        }

        public GetTableInfoResponseBodyData setTablestoreColumnsMapping(String tablestoreColumnsMapping) {
            this.tablestoreColumnsMapping = tablestoreColumnsMapping;
            return this;
        }
        public String getTablestoreColumnsMapping() {
            return this.tablestoreColumnsMapping;
        }

        public GetTableInfoResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetTableInfoResponseBodyData setViewText(String viewText) {
            this.viewText = viewText;
            return this;
        }
        public String getViewText() {
            return this.viewText;
        }

    }

}
