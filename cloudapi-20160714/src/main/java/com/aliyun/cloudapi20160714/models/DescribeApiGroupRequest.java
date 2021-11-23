// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiGroupRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Tag")
    public java.util.List<DescribeApiGroupRequestTag> tag;

    public static DescribeApiGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiGroupRequest self = new DescribeApiGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApiGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeApiGroupRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeApiGroupRequest setTag(java.util.List<DescribeApiGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeApiGroupRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeApiGroupRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeApiGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiGroupRequestTag self = new DescribeApiGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeApiGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeApiGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
