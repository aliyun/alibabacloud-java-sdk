// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataSourceResponseBody extends TeaModel {
    /**
     * <p>The data source details.</p>
     */
    @NameInMap("DataSource")
    public GetDataSourceResponseBodyDataSource dataSource;

    /**
     * <p>The request ID. Used for locating logs and troubleshooting issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9252F32F-D855-549E-8898-61CF5A733050</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceResponseBody self = new GetDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataSourceResponseBody setDataSource(GetDataSourceResponseBodyDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public GetDataSourceResponseBodyDataSource getDataSource() {
        return this.dataSource;
    }

    public GetDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDataSourceResponseBodyDataSource extends TeaModel {
        /**
         * <p>The connection configuration of the data source, including the endpoint, access identity, and environment context. The data source environment type (envType) is a member property of this object. Valid values:</p>
         * <ul>
         * <li>Dev: development environment.</li>
         * <li>Prod: production environment.</li>
         * </ul>
         * <p>Different types of data sources have different property specifications under different configuration modes (ConnectionPropertiesMode). For more information, see <a href="https://help.aliyun.com/document_detail/2852465.html">Data source connection properties (ConnectionProperties)</a>.</p>
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
         * <p>The category in which the data source is added. Different types have different subtypes with different parameter constraints. Examples:</p>
         * <ul>
         * <li>InstanceMode: instance mode.</li>
         * <li>UrlMode: connection string mode.</li>
         * <li>CdhMode: CDH mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UrlMode</p>
         */
        @NameInMap("ConnectionPropertiesMode")
        public String connectionPropertiesMode;

        /**
         * <p>The time when the data source was created (timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1698286929333</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the user who created the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>1107550004253538</p>
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
         * <p>16738</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The time when the data source was last modified (timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1698286929333</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The ID of the user who last modified the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>1107550004253538</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the workspace to which the data source belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>52660</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The business unique key of the data source. For example, the format for a Hologres data source is <code>${tenantOwnerId}:${regionId}:${type}:${instanceId}:${database}</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1107550004253538:cn-beijing:holo:hgprecn-cn-x0r3oun4k001:testdb</p>
         */
        @NameInMap("QualifiedName")
        public String qualifiedName;

        /**
         * <p>The type of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>hologres</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDataSourceResponseBodyDataSource build(java.util.Map<String, ?> map) throws Exception {
            GetDataSourceResponseBodyDataSource self = new GetDataSourceResponseBodyDataSource();
            return TeaModel.build(map, self);
        }

        public GetDataSourceResponseBodyDataSource setConnectionProperties(Object connectionProperties) {
            this.connectionProperties = connectionProperties;
            return this;
        }
        public Object getConnectionProperties() {
            return this.connectionProperties;
        }

        public GetDataSourceResponseBodyDataSource setConnectionPropertiesMode(String connectionPropertiesMode) {
            this.connectionPropertiesMode = connectionPropertiesMode;
            return this;
        }
        public String getConnectionPropertiesMode() {
            return this.connectionPropertiesMode;
        }

        public GetDataSourceResponseBodyDataSource setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetDataSourceResponseBodyDataSource setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetDataSourceResponseBodyDataSource setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataSourceResponseBodyDataSource setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDataSourceResponseBodyDataSource setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetDataSourceResponseBodyDataSource setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public GetDataSourceResponseBodyDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataSourceResponseBodyDataSource setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDataSourceResponseBodyDataSource setQualifiedName(String qualifiedName) {
            this.qualifiedName = qualifiedName;
            return this;
        }
        public String getQualifiedName() {
            return this.qualifiedName;
        }

        public GetDataSourceResponseBodyDataSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
