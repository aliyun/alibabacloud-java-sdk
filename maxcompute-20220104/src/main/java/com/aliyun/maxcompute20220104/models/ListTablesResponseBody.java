// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListTablesResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ListTablesResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTablesResponseBody self = new ListTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTablesResponseBody setData(ListTablesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTablesResponseBodyData getData() {
        return this.data;
    }

    public ListTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTablesResponseBodyDataTablesNativeColumns extends TeaModel {
        @NameInMap("comment")
        public String comment;

        @NameInMap("label")
        public String label;

        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

        public static ListTablesResponseBodyDataTablesNativeColumns build(java.util.Map<String, ?> map) throws Exception {
            ListTablesResponseBodyDataTablesNativeColumns self = new ListTablesResponseBodyDataTablesNativeColumns();
            return TeaModel.build(map, self);
        }

        public ListTablesResponseBodyDataTablesNativeColumns setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListTablesResponseBodyDataTablesNativeColumns setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListTablesResponseBodyDataTablesNativeColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTablesResponseBodyDataTablesNativeColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListTablesResponseBodyDataTablesPartitionColumns extends TeaModel {
        @NameInMap("comment")
        public String comment;

        @NameInMap("label")
        public String label;

        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

        public static ListTablesResponseBodyDataTablesPartitionColumns build(java.util.Map<String, ?> map) throws Exception {
            ListTablesResponseBodyDataTablesPartitionColumns self = new ListTablesResponseBodyDataTablesPartitionColumns();
            return TeaModel.build(map, self);
        }

        public ListTablesResponseBodyDataTablesPartitionColumns setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListTablesResponseBodyDataTablesPartitionColumns setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListTablesResponseBodyDataTablesPartitionColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTablesResponseBodyDataTablesPartitionColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListTablesResponseBodyDataTables extends TeaModel {
        @NameInMap("autoRefreshEnabled")
        public Boolean autoRefreshEnabled;

        @NameInMap("createTableDDL")
        public String createTableDDL;

        /**
         * <p>The time when the table was created.</p>
         */
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

        /**
         * <p>The name of the table.</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("nativeColumns")
        public java.util.List<ListTablesResponseBodyDataTablesNativeColumns> nativeColumns;

        @NameInMap("odpsPropertiesRolearn")
        public String odpsPropertiesRolearn;

        @NameInMap("odpsSqlTextOptionFlushHeader")
        public Boolean odpsSqlTextOptionFlushHeader;

        @NameInMap("odpsTextOptionHeaderLinesCount")
        public Long odpsTextOptionHeaderLinesCount;

        /**
         * <p>The owner of the table.</p>
         */
        @NameInMap("owner")
        public String owner;

        @NameInMap("partitionColumns")
        public java.util.List<ListTablesResponseBodyDataTablesPartitionColumns> partitionColumns;

        @NameInMap("physicalSize")
        public Long physicalSize;

        @NameInMap("projectName")
        public String projectName;

        @NameInMap("rewriteEnabled")
        public Boolean rewriteEnabled;

        /**
         * <p>The schema of the table.</p>
         */
        @NameInMap("schema")
        public String schema;

        @NameInMap("size")
        public Long size;

        @NameInMap("storageHandler")
        public String storageHandler;

        @NameInMap("tableComment")
        public String tableComment;

        @NameInMap("tableLabel")
        public String tableLabel;

        @NameInMap("tablesotreTableName")
        public String tablesotreTableName;

        @NameInMap("tablestoreColumnsMapping")
        public String tablestoreColumnsMapping;

        /**
         * <p>The type of the table.</p>
         */
        @NameInMap("type")
        public String type;

        @NameInMap("viewText")
        public String viewText;

        public static ListTablesResponseBodyDataTables build(java.util.Map<String, ?> map) throws Exception {
            ListTablesResponseBodyDataTables self = new ListTablesResponseBodyDataTables();
            return TeaModel.build(map, self);
        }

        public ListTablesResponseBodyDataTables setAutoRefreshEnabled(Boolean autoRefreshEnabled) {
            this.autoRefreshEnabled = autoRefreshEnabled;
            return this;
        }
        public Boolean getAutoRefreshEnabled() {
            return this.autoRefreshEnabled;
        }

        public ListTablesResponseBodyDataTables setCreateTableDDL(String createTableDDL) {
            this.createTableDDL = createTableDDL;
            return this;
        }
        public String getCreateTableDDL() {
            return this.createTableDDL;
        }

        public ListTablesResponseBodyDataTables setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public ListTablesResponseBodyDataTables setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListTablesResponseBodyDataTables setFileNum(Long fileNum) {
            this.fileNum = fileNum;
            return this;
        }
        public Long getFileNum() {
            return this.fileNum;
        }

        public ListTablesResponseBodyDataTables setIsExternalTable(Boolean isExternalTable) {
            this.isExternalTable = isExternalTable;
            return this;
        }
        public Boolean getIsExternalTable() {
            return this.isExternalTable;
        }

        public ListTablesResponseBodyDataTables setIsOutdated(Boolean isOutdated) {
            this.isOutdated = isOutdated;
            return this;
        }
        public Boolean getIsOutdated() {
            return this.isOutdated;
        }

        public ListTablesResponseBodyDataTables setLastAccessTime(Long lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }
        public Long getLastAccessTime() {
            return this.lastAccessTime;
        }

        public ListTablesResponseBodyDataTables setLastDDLTime(Long lastDDLTime) {
            this.lastDDLTime = lastDDLTime;
            return this;
        }
        public Long getLastDDLTime() {
            return this.lastDDLTime;
        }

        public ListTablesResponseBodyDataTables setLastModifiedTime(Long lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public Long getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public ListTablesResponseBodyDataTables setLifecycle(String lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }
        public String getLifecycle() {
            return this.lifecycle;
        }

        public ListTablesResponseBodyDataTables setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListTablesResponseBodyDataTables setMaterializedView(Boolean materializedView) {
            this.materializedView = materializedView;
            return this;
        }
        public Boolean getMaterializedView() {
            return this.materializedView;
        }

        public ListTablesResponseBodyDataTables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTablesResponseBodyDataTables setNativeColumns(java.util.List<ListTablesResponseBodyDataTablesNativeColumns> nativeColumns) {
            this.nativeColumns = nativeColumns;
            return this;
        }
        public java.util.List<ListTablesResponseBodyDataTablesNativeColumns> getNativeColumns() {
            return this.nativeColumns;
        }

        public ListTablesResponseBodyDataTables setOdpsPropertiesRolearn(String odpsPropertiesRolearn) {
            this.odpsPropertiesRolearn = odpsPropertiesRolearn;
            return this;
        }
        public String getOdpsPropertiesRolearn() {
            return this.odpsPropertiesRolearn;
        }

        public ListTablesResponseBodyDataTables setOdpsSqlTextOptionFlushHeader(Boolean odpsSqlTextOptionFlushHeader) {
            this.odpsSqlTextOptionFlushHeader = odpsSqlTextOptionFlushHeader;
            return this;
        }
        public Boolean getOdpsSqlTextOptionFlushHeader() {
            return this.odpsSqlTextOptionFlushHeader;
        }

        public ListTablesResponseBodyDataTables setOdpsTextOptionHeaderLinesCount(Long odpsTextOptionHeaderLinesCount) {
            this.odpsTextOptionHeaderLinesCount = odpsTextOptionHeaderLinesCount;
            return this;
        }
        public Long getOdpsTextOptionHeaderLinesCount() {
            return this.odpsTextOptionHeaderLinesCount;
        }

        public ListTablesResponseBodyDataTables setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListTablesResponseBodyDataTables setPartitionColumns(java.util.List<ListTablesResponseBodyDataTablesPartitionColumns> partitionColumns) {
            this.partitionColumns = partitionColumns;
            return this;
        }
        public java.util.List<ListTablesResponseBodyDataTablesPartitionColumns> getPartitionColumns() {
            return this.partitionColumns;
        }

        public ListTablesResponseBodyDataTables setPhysicalSize(Long physicalSize) {
            this.physicalSize = physicalSize;
            return this;
        }
        public Long getPhysicalSize() {
            return this.physicalSize;
        }

        public ListTablesResponseBodyDataTables setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListTablesResponseBodyDataTables setRewriteEnabled(Boolean rewriteEnabled) {
            this.rewriteEnabled = rewriteEnabled;
            return this;
        }
        public Boolean getRewriteEnabled() {
            return this.rewriteEnabled;
        }

        public ListTablesResponseBodyDataTables setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public ListTablesResponseBodyDataTables setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListTablesResponseBodyDataTables setStorageHandler(String storageHandler) {
            this.storageHandler = storageHandler;
            return this;
        }
        public String getStorageHandler() {
            return this.storageHandler;
        }

        public ListTablesResponseBodyDataTables setTableComment(String tableComment) {
            this.tableComment = tableComment;
            return this;
        }
        public String getTableComment() {
            return this.tableComment;
        }

        public ListTablesResponseBodyDataTables setTableLabel(String tableLabel) {
            this.tableLabel = tableLabel;
            return this;
        }
        public String getTableLabel() {
            return this.tableLabel;
        }

        public ListTablesResponseBodyDataTables setTablesotreTableName(String tablesotreTableName) {
            this.tablesotreTableName = tablesotreTableName;
            return this;
        }
        public String getTablesotreTableName() {
            return this.tablesotreTableName;
        }

        public ListTablesResponseBodyDataTables setTablestoreColumnsMapping(String tablestoreColumnsMapping) {
            this.tablestoreColumnsMapping = tablestoreColumnsMapping;
            return this;
        }
        public String getTablestoreColumnsMapping() {
            return this.tablestoreColumnsMapping;
        }

        public ListTablesResponseBodyDataTables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListTablesResponseBodyDataTables setViewText(String viewText) {
            this.viewText = viewText;
            return this;
        }
        public String getViewText() {
            return this.viewText;
        }

    }

    public static class ListTablesResponseBodyData extends TeaModel {
        /**
         * <p>Indicates the marker after which the returned list begins.</p>
         */
        @NameInMap("marker")
        public String marker;

        /**
         * <p>The maximum number of entries returned per page.</p>
         */
        @NameInMap("maxItem")
        public Integer maxItem;

        /**
         * <p>The information about tables.</p>
         */
        @NameInMap("tables")
        public java.util.List<ListTablesResponseBodyDataTables> tables;

        public static ListTablesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTablesResponseBodyData self = new ListTablesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTablesResponseBodyData setMarker(String marker) {
            this.marker = marker;
            return this;
        }
        public String getMarker() {
            return this.marker;
        }

        public ListTablesResponseBodyData setMaxItem(Integer maxItem) {
            this.maxItem = maxItem;
            return this;
        }
        public Integer getMaxItem() {
            return this.maxItem;
        }

        public ListTablesResponseBodyData setTables(java.util.List<ListTablesResponseBodyDataTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<ListTablesResponseBodyDataTables> getTables() {
            return this.tables;
        }

    }

}
