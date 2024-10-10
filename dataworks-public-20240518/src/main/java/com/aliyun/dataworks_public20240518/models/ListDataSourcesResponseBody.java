// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataSourcesResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListDataSourcesResponseBodyPagingInfo pagingInfo;

    /**
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
         * <strong>example:</strong>
         * <p>UrlMode</p>
         */
        @NameInMap("ConnectionPropertiesMode")
        public String connectionPropertiesMode;

        /**
         * <strong>example:</strong>
         * <p>1648711113000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>1624387842781448</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>16035</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>1648711113000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <strong>example:</strong>
         * <p>1624387842781448</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
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
        @NameInMap("DataSource")
        public java.util.List<ListDataSourcesResponseBodyPagingInfoDataSourcesDataSource> dataSource;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
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
        @NameInMap("DataSources")
        public java.util.List<ListDataSourcesResponseBodyPagingInfoDataSources> dataSources;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
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
