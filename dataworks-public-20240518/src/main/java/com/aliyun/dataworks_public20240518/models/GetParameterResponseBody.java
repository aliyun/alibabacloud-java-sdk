// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetParameterResponseBody extends TeaModel {
    /**
     * <p>The details of the parameter.</p>
     */
    @NameInMap("Parameter")
    public GetParameterResponseBodyParameter parameter;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetParameterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetParameterResponseBody self = new GetParameterResponseBody();
        return TeaModel.build(map, self);
    }

    public GetParameterResponseBody setParameter(GetParameterResponseBodyParameter parameter) {
        this.parameter = parameter;
        return this;
    }
    public GetParameterResponseBodyParameter getParameter() {
        return this.parameter;
    }

    public GetParameterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetParameterResponseBodyParameterProperties extends TeaModel {
        /**
         * <p>The project environment. Valid values:</p>
         * <ul>
         * <li><p><code>Prod</code>: production.</p>
         * </li>
         * <li><p><code>Dev</code>: development.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>value123</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetParameterResponseBodyParameterProperties build(java.util.Map<String, ?> map) throws Exception {
            GetParameterResponseBodyParameterProperties self = new GetParameterResponseBodyParameterProperties();
            return TeaModel.build(map, self);
        }

        public GetParameterResponseBodyParameterProperties setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetParameterResponseBodyParameterProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetParameterResponseBodyParameter extends TeaModel {
        /**
         * <p>The time when the parameter was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1640000000000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The creator of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The description of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a test parameter.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The time when the parameter was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1640000000000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The modifier of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace.para</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The owner of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The value configurations of the parameter.</p>
         */
        @NameInMap("Properties")
        public java.util.List<GetParameterResponseBodyParameterProperties> properties;

        /**
         * <p>The scope of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Project</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>The type of the parameter. Valid values:</p>
         * <ul>
         * <li><p><code>PlainConstant</code>: a constant in plaintext.</p>
         * </li>
         * <li><p><code>SecretConstant</code>: a constant in ciphertext.</p>
         * </li>
         * <li><p><code>Variable</code>: a variable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PlainConstant</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The version of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static GetParameterResponseBodyParameter build(java.util.Map<String, ?> map) throws Exception {
            GetParameterResponseBodyParameter self = new GetParameterResponseBodyParameter();
            return TeaModel.build(map, self);
        }

        public GetParameterResponseBodyParameter setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetParameterResponseBodyParameter setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetParameterResponseBodyParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetParameterResponseBodyParameter setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetParameterResponseBodyParameter setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetParameterResponseBodyParameter setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public GetParameterResponseBodyParameter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetParameterResponseBodyParameter setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetParameterResponseBodyParameter setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetParameterResponseBodyParameter setProperties(java.util.List<GetParameterResponseBodyParameterProperties> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.List<GetParameterResponseBodyParameterProperties> getProperties() {
            return this.properties;
        }

        public GetParameterResponseBodyParameter setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public GetParameterResponseBodyParameter setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetParameterResponseBodyParameter setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
