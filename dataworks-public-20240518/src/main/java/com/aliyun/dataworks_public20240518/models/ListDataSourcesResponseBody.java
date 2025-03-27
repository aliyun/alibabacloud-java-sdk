// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataSourcesResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListDataSourcesResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7BE1433F-6D55-5D86-9344-CA6F7DD19B13</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDataSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourcesResponseBody self = new ListDataSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSourcesResponseBody setPagingInfo(ListDataSourcesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListDataSourcesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListDataSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataSourcesResponseBodyPagingInfoDataSourcesDataSource extends TeaModel {
        /**
         * <p>The connection configurations of the data source, including the connection address, access identity, and environment information. The envType parameter specifies the environment in which the data source is used. Valid values of the envType parameter:</p>
         * <ul>
         * <li>Dev: development environment</li>
         * <li>Prod: production environment</li>
         * </ul>
         * <p>The parameters that you need to configure for the data source vary based on the mode in which the data source is added. For more information, see <a href="https://help.aliyun.com/document_detail/2852465.html">Data source connection information (ConnectionProperties)</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;envType&quot;: &quot;Prod&quot;,
         *     &quot;regionId&quot;: &quot;cn-beijing&quot;,
         *     &quot;instanceId&quot;: &quot;hgprecn-cn-x0r3oun4k001&quot;,
         *     &quot;database&quot;: &quot;testdb&quot;,
         *     &quot;securityProtocol&quot;: &quot;authTypeNone&quot;,
         *     &quot;authType&quot;: &quot;Executor&quot;,
         *     &quot;authIdentity&quot;: &quot;1107550004253538&quot;
         * }</p>
         */
        @NameInMap("ConnectionProperties")
        public Object connectionProperties;

        /**
         * <p>The mode in which the data source is added. The mode varies based on the data source type. Valid values:</p>
         * <ul>
         * <li>InstanceMode: instance mode</li>
         * <li>UrlMode: connection string mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UrlMode</p>
         */
        @NameInMap("ConnectionPropertiesMode")
        public String connectionPropertiesMode;

        /**
         * <p>The time when the data source was added. This value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1648711113000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the user who adds the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>1624387842781448</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The description of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>16035</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The time when the data source was last modified. This value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1648711113000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The ID of the user who modifies the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>1624387842781448</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>The unique business key of the data source. For example, the unique business key of a Hologres data source is in the <code>${tenantOwnerId}:${regionId}:${type}:${instanceId}:${database}</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>1648711121000:cn-beijing:odps:yongxunQA_beijing_standard</p>
         */
        @NameInMap("QualifiedName")
        public String qualifiedName;

        public static ListDataSourcesResponseBodyPagingInfoDataSourcesDataSource build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourcesResponseBodyPagingInfoDataSourcesDataSource self = new ListDataSourcesResponseBodyPagingInfoDataSourcesDataSource();
            return TeaModel.build(map, self);
        }

        public ListDataSourcesResponseBodyPagingInfoDataSourcesDataSource setConnectionProperties(Object connectionProperties) {
            this.connectionProperties = connectionProperties;
            return this;
        }
        public Object getConnectionProperties() {
            return this.connectionProperties;
        }

        public ListDataSourcesResponseBodyPagingInfoDataSourcesDataSource setConnectionPropertiesMode(String connectionPropertiesMode) {
            this.connectionPropertiesMode = connectionPropertiesMode;
            return this;
        }
        public String getConnectionPropertiesMode() {
            return this.connectionPropertiesMode;
        }

        public ListDataSourcesResponseBodyPagingInfoDataSourcesDataSource setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDataSourcesResponseBodyPagingInfoDataSourcesDataSource setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListDataSourcesResponseBodyPagingInfoDataSourcesDataSource setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataSourcesResponseBodyPagingInfoDataSourcesDataSource setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDataSourcesResponseBodyPagingInfoDataSourcesDataSource setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListDataSourcesResponseBodyPagingInfoDataSourcesDataSource setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public ListDataSourcesResponseBodyPagingInfoDataSourcesDataSource setQualifiedName(String qualifiedName) {
            this.qualifiedName = qualifiedName;
            return this;
        }
        public String getQualifiedName() {
            return this.qualifiedName;
        }

    }

    public static class ListDataSourcesResponseBodyPagingInfoDataSources extends TeaModel {
        /**
         * <p>The data sources. Each element is the information of a single data source with a unique data source ID.</p>
         */
        @NameInMap("DataSource")
        public java.util.List<ListDataSourcesResponseBodyPagingInfoDataSourcesDataSource> dataSource;

        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDataSourcesResponseBodyPagingInfoDataSources build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourcesResponseBodyPagingInfoDataSources self = new ListDataSourcesResponseBodyPagingInfoDataSources();
            return TeaModel.build(map, self);
        }

        public ListDataSourcesResponseBodyPagingInfoDataSources setDataSource(java.util.List<ListDataSourcesResponseBodyPagingInfoDataSourcesDataSource> dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public java.util.List<ListDataSourcesResponseBodyPagingInfoDataSourcesDataSource> getDataSource() {
            return this.dataSource;
        }

        public ListDataSourcesResponseBodyPagingInfoDataSources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataSourcesResponseBodyPagingInfoDataSources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataSourcesResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The data source groups. Each element in the array indicates a data source group. Each data source group contains data sources in the development environment (if any) and the production environment.</p>
         */
        @NameInMap("DataSources")
        public java.util.List<ListDataSourcesResponseBodyPagingInfoDataSources> dataSources;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>131</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListDataSourcesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourcesResponseBodyPagingInfo self = new ListDataSourcesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListDataSourcesResponseBodyPagingInfo setDataSources(java.util.List<ListDataSourcesResponseBodyPagingInfoDataSources> dataSources) {
            this.dataSources = dataSources;
            return this;
        }
        public java.util.List<ListDataSourcesResponseBodyPagingInfoDataSources> getDataSources() {
            return this.dataSources;
        }

        public ListDataSourcesResponseBodyPagingInfo setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListDataSourcesResponseBodyPagingInfo setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListDataSourcesResponseBodyPagingInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
