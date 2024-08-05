// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateApiGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>/qqq</p>
     */
    @NameInMap("BasePath")
    public String basePath;

    /**
     * <strong>example:</strong>
     * <p>The weather informations.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Weather</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <strong>example:</strong>
     * <p>apigateway-cn-v6419k43xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <strong>example:</strong>
     * <p>Key， Value</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateApiGroupRequestTag> tag;

    public static CreateApiGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApiGroupRequest self = new CreateApiGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateApiGroupRequest setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }
    public String getBasePath() {
        return this.basePath;
    }

    public CreateApiGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApiGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateApiGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateApiGroupRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateApiGroupRequest setTag(java.util.List<CreateApiGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateApiGroupRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateApiGroupRequestTag extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateApiGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateApiGroupRequestTag self = new CreateApiGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateApiGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateApiGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
