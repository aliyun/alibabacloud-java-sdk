// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AddDesktopOversoldUserGroupRequest extends TeaModel {
    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("Name")
    public String name;

    @NameInMap("OversoldGroupId")
    public String oversoldGroupId;

    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    @NameInMap("Tag")
    public java.util.List<AddDesktopOversoldUserGroupRequestTag> tag;

    public static AddDesktopOversoldUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDesktopOversoldUserGroupRequest self = new AddDesktopOversoldUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddDesktopOversoldUserGroupRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public AddDesktopOversoldUserGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddDesktopOversoldUserGroupRequest setOversoldGroupId(String oversoldGroupId) {
        this.oversoldGroupId = oversoldGroupId;
        return this;
    }
    public String getOversoldGroupId() {
        return this.oversoldGroupId;
    }

    public AddDesktopOversoldUserGroupRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public AddDesktopOversoldUserGroupRequest setTag(java.util.List<AddDesktopOversoldUserGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<AddDesktopOversoldUserGroupRequestTag> getTag() {
        return this.tag;
    }

    public static class AddDesktopOversoldUserGroupRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static AddDesktopOversoldUserGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            AddDesktopOversoldUserGroupRequestTag self = new AddDesktopOversoldUserGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public AddDesktopOversoldUserGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddDesktopOversoldUserGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
