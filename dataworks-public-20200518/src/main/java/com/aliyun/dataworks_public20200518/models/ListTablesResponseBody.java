// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListTablesResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListTablesResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E25887B7-579C-54A5-9C4F-83A0DE367DD</p>
     */
    @NameInMap("RequestId")
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

    public static class ListTablesResponseBodyDataTableEntityListEntityContent extends TeaModel {
        /**
         * <p>The unique identifier of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>accountId:cn-shanghai:odps:project</p>
         */
        @NameInMap("DataSourceQualifiedName")
        public String dataSourceQualifiedName;

        /**
         * <p>The unique ID of the data source identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>e70f92239d491057f6a2563b545bdaf8cc6b537d9dc55ec84c55f7cfefg</p>
         */
        @NameInMap("DataSourceUniqueId")
        public String dataSourceUniqueId;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>database</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The ID of the data source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6rn0123</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the ODPS project.</p>
         * 
         * <strong>example:</strong>
         * <p>project</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>table</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static ListTablesResponseBodyDataTableEntityListEntityContent build(java.util.Map<String, ?> map) throws Exception {
            ListTablesResponseBodyDataTableEntityListEntityContent self = new ListTablesResponseBodyDataTableEntityListEntityContent();
            return TeaModel.build(map, self);
        }

        public ListTablesResponseBodyDataTableEntityListEntityContent setDataSourceQualifiedName(String dataSourceQualifiedName) {
            this.dataSourceQualifiedName = dataSourceQualifiedName;
            return this;
        }
        public String getDataSourceQualifiedName() {
            return this.dataSourceQualifiedName;
        }

        public ListTablesResponseBodyDataTableEntityListEntityContent setDataSourceUniqueId(String dataSourceUniqueId) {
            this.dataSourceUniqueId = dataSourceUniqueId;
            return this;
        }
        public String getDataSourceUniqueId() {
            return this.dataSourceUniqueId;
        }

        public ListTablesResponseBodyDataTableEntityListEntityContent setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public ListTablesResponseBodyDataTableEntityListEntityContent setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListTablesResponseBodyDataTableEntityListEntityContent setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListTablesResponseBodyDataTableEntityListEntityContent setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class ListTablesResponseBodyDataTableEntityList extends TeaModel {
        /**
         * <p>The information about the table.</p>
         */
        @NameInMap("EntityContent")
        public ListTablesResponseBodyDataTableEntityListEntityContent entityContent;

        /**
         * <p>The unique identifier of the table entity.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-table.project.table</p>
         */
        @NameInMap("EntityQualifiedName")
        public String entityQualifiedName;

        public static ListTablesResponseBodyDataTableEntityList build(java.util.Map<String, ?> map) throws Exception {
            ListTablesResponseBodyDataTableEntityList self = new ListTablesResponseBodyDataTableEntityList();
            return TeaModel.build(map, self);
        }

        public ListTablesResponseBodyDataTableEntityList setEntityContent(ListTablesResponseBodyDataTableEntityListEntityContent entityContent) {
            this.entityContent = entityContent;
            return this;
        }
        public ListTablesResponseBodyDataTableEntityListEntityContent getEntityContent() {
            return this.entityContent;
        }

        public ListTablesResponseBodyDataTableEntityList setEntityQualifiedName(String entityQualifiedName) {
            this.entityQualifiedName = entityQualifiedName;
            return this;
        }
        public String getEntityQualifiedName() {
            return this.entityQualifiedName;
        }

    }

    public static class ListTablesResponseBodyData extends TeaModel {
        /**
         * <p>Pagination information, which specifies the starting point of the next read.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAVY3rYiv9VoUJQSiCitgjgSwg+byk0FIjirFkm4zfM4G0xYwM/FQvOhgrTHsCPIZ5yqXYu2NG6qRCRC52HvwbOA=</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>An array of entities.</p>
         */
        @NameInMap("TableEntityList")
        public java.util.List<ListTablesResponseBodyDataTableEntityList> tableEntityList;

        /**
         * <p>The total number.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListTablesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTablesResponseBodyData self = new ListTablesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTablesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListTablesResponseBodyData setTableEntityList(java.util.List<ListTablesResponseBodyDataTableEntityList> tableEntityList) {
            this.tableEntityList = tableEntityList;
            return this;
        }
        public java.util.List<ListTablesResponseBodyDataTableEntityList> getTableEntityList() {
            return this.tableEntityList;
        }

        public ListTablesResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
