// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListParametersResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("PagingInfo")
    public ListParametersResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListParametersResponseBody self = new ListParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListParametersResponseBody setPagingInfo(ListParametersResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListParametersResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListParametersResponseBodyPagingInfoParametersProperties extends TeaModel {
        /**
         * <p>The project environment. Valid values:</p>
         * <ul>
         * <li>Prod: production environment.</li>
         * <li>Dev: development environment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>value123</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListParametersResponseBodyPagingInfoParametersProperties build(java.util.Map<String, ?> map) throws Exception {
            ListParametersResponseBodyPagingInfoParametersProperties self = new ListParametersResponseBodyPagingInfoParametersProperties();
            return TeaModel.build(map, self);
        }

        public ListParametersResponseBodyPagingInfoParametersProperties setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListParametersResponseBodyPagingInfoParametersProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListParametersResponseBodyPagingInfoParameters extends TeaModel {
        /**
         * <p>The creation time.</p>
         * <p>The value is a 13-digit number, such as <code>1640000000000</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1640000000000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The user who created the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a test parameter</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The parameter ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The modification time.</p>
         * <p>The value is a 13-digit number, such as <code>1640000000000</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1640000000000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The user who last modified the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace.para</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The owner.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The parameter value configuration.</p>
         */
        @NameInMap("Properties")
        public java.util.List<ListParametersResponseBodyPagingInfoParametersProperties> properties;

        /**
         * <p>The scope of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Project</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>The parameter type. Valid values:</p>
         * <ul>
         * <li>PlainConstant: plaintext constant.</li>
         * <li>SecretConstant: ciphertext constant.</li>
         * <li>Variable: variable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PlainConstant</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static ListParametersResponseBodyPagingInfoParameters build(java.util.Map<String, ?> map) throws Exception {
            ListParametersResponseBodyPagingInfoParameters self = new ListParametersResponseBodyPagingInfoParameters();
            return TeaModel.build(map, self);
        }

        public ListParametersResponseBodyPagingInfoParameters setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListParametersResponseBodyPagingInfoParameters setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListParametersResponseBodyPagingInfoParameters setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListParametersResponseBodyPagingInfoParameters setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListParametersResponseBodyPagingInfoParameters setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListParametersResponseBodyPagingInfoParameters setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public ListParametersResponseBodyPagingInfoParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListParametersResponseBodyPagingInfoParameters setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListParametersResponseBodyPagingInfoParameters setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListParametersResponseBodyPagingInfoParameters setProperties(java.util.List<ListParametersResponseBodyPagingInfoParametersProperties> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.List<ListParametersResponseBodyPagingInfoParametersProperties> getProperties() {
            return this.properties;
        }

        public ListParametersResponseBodyPagingInfoParameters setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListParametersResponseBodyPagingInfoParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListParametersResponseBodyPagingInfoParameters setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class ListParametersResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The list of parameters.</p>
         */
        @NameInMap("Parameters")
        public java.util.List<ListParametersResponseBodyPagingInfoParameters> parameters;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListParametersResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListParametersResponseBodyPagingInfo self = new ListParametersResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListParametersResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListParametersResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListParametersResponseBodyPagingInfo setParameters(java.util.List<ListParametersResponseBodyPagingInfoParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<ListParametersResponseBodyPagingInfoParameters> getParameters() {
            return this.parameters;
        }

        public ListParametersResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
