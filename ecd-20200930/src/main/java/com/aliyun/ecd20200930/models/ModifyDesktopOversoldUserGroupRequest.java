// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopOversoldUserGroupRequest extends TeaModel {
    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("Name")
    public String name;

    @NameInMap("OversoldGroupId")
    public String oversoldGroupId;

    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    @NameInMap("UserGroupId")
    public String userGroupId;

    public static ModifyDesktopOversoldUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopOversoldUserGroupRequest self = new ModifyDesktopOversoldUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopOversoldUserGroupRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyDesktopOversoldUserGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyDesktopOversoldUserGroupRequest setOversoldGroupId(String oversoldGroupId) {
        this.oversoldGroupId = oversoldGroupId;
        return this;
    }
    public String getOversoldGroupId() {
        return this.oversoldGroupId;
    }

    public ModifyDesktopOversoldUserGroupRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public ModifyDesktopOversoldUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
