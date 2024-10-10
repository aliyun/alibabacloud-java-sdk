// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataSourceResponseBody extends TeaModel {
    @NameInMap("DataSource")
    public GetDataSourceResponseBodyDataSource dataSource;

    /**
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
         * <p>1698286929333</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>1107550004253538</p>
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
         * <p>16738</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>1698286929333</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <strong>example:</strong>
         * <p>1107550004253538</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>52660</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <strong>example:</strong>
         * <p>1107550004253538:cn-beijing:holo:hgprecn-cn-x0r3oun4k001:testdb</p>
         */
        @NameInMap("QualifiedName")
        public String qualifiedName;

        /**
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
