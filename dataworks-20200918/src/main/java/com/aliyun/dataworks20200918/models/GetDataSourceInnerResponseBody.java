// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetDataSourceInnerResponseBody extends TeaModel {
    @NameInMap("DataSource")
    public GetDataSourceInnerResponseBodyDataSource dataSource;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetDataSourceInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceInnerResponseBody self = new GetDataSourceInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataSourceInnerResponseBody setDataSource(GetDataSourceInnerResponseBodyDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public GetDataSourceInnerResponseBodyDataSource getDataSource() {
        return this.dataSource;
    }

    public GetDataSourceInnerResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDataSourceInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataSourceInnerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataSourceInnerResponseBodyDataSource extends TeaModel {
        @NameInMap("ConnectionProperties")
        public String connectionProperties;

        @NameInMap("ConnectionPropertiesMode")
        public String connectionPropertiesMode;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("ModifyUser")
        public String modifyUser;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("QualifiedName")
        public String qualifiedName;

        @NameInMap("Type")
        public String type;

        public static GetDataSourceInnerResponseBodyDataSource build(java.util.Map<String, ?> map) throws Exception {
            GetDataSourceInnerResponseBodyDataSource self = new GetDataSourceInnerResponseBodyDataSource();
            return TeaModel.build(map, self);
        }

        public GetDataSourceInnerResponseBodyDataSource setConnectionProperties(String connectionProperties) {
            this.connectionProperties = connectionProperties;
            return this;
        }
        public String getConnectionProperties() {
            return this.connectionProperties;
        }

        public GetDataSourceInnerResponseBodyDataSource setConnectionPropertiesMode(String connectionPropertiesMode) {
            this.connectionPropertiesMode = connectionPropertiesMode;
            return this;
        }
        public String getConnectionPropertiesMode() {
            return this.connectionPropertiesMode;
        }

        public GetDataSourceInnerResponseBodyDataSource setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetDataSourceInnerResponseBodyDataSource setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetDataSourceInnerResponseBodyDataSource setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataSourceInnerResponseBodyDataSource setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDataSourceInnerResponseBodyDataSource setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetDataSourceInnerResponseBodyDataSource setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public GetDataSourceInnerResponseBodyDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataSourceInnerResponseBodyDataSource setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDataSourceInnerResponseBodyDataSource setQualifiedName(String qualifiedName) {
            this.qualifiedName = qualifiedName;
            return this;
        }
        public String getQualifiedName() {
            return this.qualifiedName;
        }

        public GetDataSourceInnerResponseBodyDataSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
