// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteApiGroupRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Tag")
    public java.util.List<DeleteApiGroupRequestTag> tag;

    public static DeleteApiGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiGroupRequest self = new DeleteApiGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApiGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteApiGroupRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DeleteApiGroupRequest setTag(java.util.List<DeleteApiGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DeleteApiGroupRequestTag> getTag() {
        return this.tag;
    }

    public static class DeleteApiGroupRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DeleteApiGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DeleteApiGroupRequestTag self = new DeleteApiGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public DeleteApiGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DeleteApiGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
