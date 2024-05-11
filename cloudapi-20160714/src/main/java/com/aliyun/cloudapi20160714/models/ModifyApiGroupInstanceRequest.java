// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyApiGroupInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Tag")
    public java.util.List<ModifyApiGroupInstanceRequestTag> tag;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetInstanceId")
    public String targetInstanceId;

    public static ModifyApiGroupInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiGroupInstanceRequest self = new ModifyApiGroupInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApiGroupInstanceRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ModifyApiGroupInstanceRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ModifyApiGroupInstanceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyApiGroupInstanceRequest setTag(java.util.List<ModifyApiGroupInstanceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ModifyApiGroupInstanceRequestTag> getTag() {
        return this.tag;
    }

    public ModifyApiGroupInstanceRequest setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

    public static class ModifyApiGroupInstanceRequestTag extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ModifyApiGroupInstanceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ModifyApiGroupInstanceRequestTag self = new ModifyApiGroupInstanceRequestTag();
            return TeaModel.build(map, self);
        }

        public ModifyApiGroupInstanceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyApiGroupInstanceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
