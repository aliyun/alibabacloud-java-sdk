// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListParameterVersionsResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListParameterVersionsResponseBodyPagingInfo pagingInfo;

    /**
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListParameterVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListParameterVersionsResponseBody self = new ListParameterVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListParameterVersionsResponseBody setPagingInfo(ListParameterVersionsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListParameterVersionsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListParameterVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListParameterVersionsResponseBodyPagingInfoParameterVersionProperties extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <strong>example:</strong>
         * <p>value123</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListParameterVersionsResponseBodyPagingInfoParameterVersionProperties build(java.util.Map<String, ?> map) throws Exception {
            ListParameterVersionsResponseBodyPagingInfoParameterVersionProperties self = new ListParameterVersionsResponseBodyPagingInfoParameterVersionProperties();
            return TeaModel.build(map, self);
        }

        public ListParameterVersionsResponseBodyPagingInfoParameterVersionProperties setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListParameterVersionsResponseBodyPagingInfoParameterVersionProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListParameterVersionsResponseBodyPagingInfoParameterVersion extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1640000000000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <strong>example:</strong>
         * <p>这是一个测试参数</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>1640000000000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <strong>example:</strong>
         * <p>workspace.para</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Properties")
        public java.util.List<ListParameterVersionsResponseBodyPagingInfoParameterVersionProperties> properties;

        /**
         * <strong>example:</strong>
         * <p>Project</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <strong>example:</strong>
         * <p>PlainConstant</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static ListParameterVersionsResponseBodyPagingInfoParameterVersion build(java.util.Map<String, ?> map) throws Exception {
            ListParameterVersionsResponseBodyPagingInfoParameterVersion self = new ListParameterVersionsResponseBodyPagingInfoParameterVersion();
            return TeaModel.build(map, self);
        }

        public ListParameterVersionsResponseBodyPagingInfoParameterVersion setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListParameterVersionsResponseBodyPagingInfoParameterVersion setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListParameterVersionsResponseBodyPagingInfoParameterVersion setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListParameterVersionsResponseBodyPagingInfoParameterVersion setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListParameterVersionsResponseBodyPagingInfoParameterVersion setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListParameterVersionsResponseBodyPagingInfoParameterVersion setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public ListParameterVersionsResponseBodyPagingInfoParameterVersion setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListParameterVersionsResponseBodyPagingInfoParameterVersion setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListParameterVersionsResponseBodyPagingInfoParameterVersion setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListParameterVersionsResponseBodyPagingInfoParameterVersion setProperties(java.util.List<ListParameterVersionsResponseBodyPagingInfoParameterVersionProperties> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.List<ListParameterVersionsResponseBodyPagingInfoParameterVersionProperties> getProperties() {
            return this.properties;
        }

        public ListParameterVersionsResponseBodyPagingInfoParameterVersion setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListParameterVersionsResponseBodyPagingInfoParameterVersion setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListParameterVersionsResponseBodyPagingInfoParameterVersion setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class ListParameterVersionsResponseBodyPagingInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("ParameterVersion")
        public java.util.List<ListParameterVersionsResponseBodyPagingInfoParameterVersion> parameterVersion;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListParameterVersionsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListParameterVersionsResponseBodyPagingInfo self = new ListParameterVersionsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListParameterVersionsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListParameterVersionsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListParameterVersionsResponseBodyPagingInfo setParameterVersion(java.util.List<ListParameterVersionsResponseBodyPagingInfoParameterVersion> parameterVersion) {
            this.parameterVersion = parameterVersion;
            return this;
        }
        public java.util.List<ListParameterVersionsResponseBodyPagingInfoParameterVersion> getParameterVersion() {
            return this.parameterVersion;
        }

        public ListParameterVersionsResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
