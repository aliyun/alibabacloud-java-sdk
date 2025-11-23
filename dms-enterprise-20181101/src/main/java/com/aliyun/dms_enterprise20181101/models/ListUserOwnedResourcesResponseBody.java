// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListUserOwnedResourcesResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     */
    @NameInMap("Data")
    public ListUserOwnedResourcesResponseBodyData data;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message that is returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID. You can use the request ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>8E88933E-E3D4-5BA8-8CBF-0A1CAE666690</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned. By default, this parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListUserOwnedResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserOwnedResourcesResponseBody self = new ListUserOwnedResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserOwnedResourcesResponseBody setData(ListUserOwnedResourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListUserOwnedResourcesResponseBodyData getData() {
        return this.data;
    }

    public ListUserOwnedResourcesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListUserOwnedResourcesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListUserOwnedResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserOwnedResourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListUserOwnedResourcesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListUserOwnedResourcesResponseBodyDataResourceList extends TeaModel {
        /**
         * <p>The alias of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>DMS_GYX_TESTupdata</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The ID of the database in DMS.</p>
         * 
         * <strong>example:</strong>
         * <p>29697059</p>
         */
        @NameInMap("DbId")
        public String dbId;

        /**
         * <p>The ID of the instance to which the database belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>876XXX</p>
         */
        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        /**
         * <p>The database engine type. For more information about the valid values of the DbType parameter, see <a href="https://help.aliyun.com/document_detail/198106.html">DbType parameter</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The type of the environment to which the database instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The endpoint of the instance to which the database belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-wz98bw60x1i1303c5.mysql.rds.aliyuncs.com</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>291594</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Indicates whether the database is a logical database. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The database is a logical database</li>
         * <li><strong>false</strong>: The database is a physical database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        /**
         * <p>The connection port of the instance to which the database belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>6379</p>
         */
        @NameInMap("Port")
        public Long port;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>as_task_engine</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The query name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstest [dtstest_dms]</p>
         */
        @NameInMap("SearchName")
        public String searchName;

        /**
         * <p>The table ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1760934555</p>
         */
        @NameInMap("TableId")
        public String tableId;

        /**
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>addepmap</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static ListUserOwnedResourcesResponseBodyDataResourceList build(java.util.Map<String, ?> map) throws Exception {
            ListUserOwnedResourcesResponseBodyDataResourceList self = new ListUserOwnedResourcesResponseBodyDataResourceList();
            return TeaModel.build(map, self);
        }

        public ListUserOwnedResourcesResponseBodyDataResourceList setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ListUserOwnedResourcesResponseBodyDataResourceList setDbId(String dbId) {
            this.dbId = dbId;
            return this;
        }
        public String getDbId() {
            return this.dbId;
        }

        public ListUserOwnedResourcesResponseBodyDataResourceList setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public ListUserOwnedResourcesResponseBodyDataResourceList setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public ListUserOwnedResourcesResponseBodyDataResourceList setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListUserOwnedResourcesResponseBodyDataResourceList setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListUserOwnedResourcesResponseBodyDataResourceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListUserOwnedResourcesResponseBodyDataResourceList setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public ListUserOwnedResourcesResponseBodyDataResourceList setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public ListUserOwnedResourcesResponseBodyDataResourceList setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public ListUserOwnedResourcesResponseBodyDataResourceList setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

        public ListUserOwnedResourcesResponseBodyDataResourceList setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

        public ListUserOwnedResourcesResponseBodyDataResourceList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class ListUserOwnedResourcesResponseBodyData extends TeaModel {
        @NameInMap("resourceList")
        public java.util.List<ListUserOwnedResourcesResponseBodyDataResourceList> resourceList;

        public static ListUserOwnedResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUserOwnedResourcesResponseBodyData self = new ListUserOwnedResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUserOwnedResourcesResponseBodyData setResourceList(java.util.List<ListUserOwnedResourcesResponseBodyDataResourceList> resourceList) {
            this.resourceList = resourceList;
            return this;
        }
        public java.util.List<ListUserOwnedResourcesResponseBodyDataResourceList> getResourceList() {
            return this.resourceList;
        }

    }

}
