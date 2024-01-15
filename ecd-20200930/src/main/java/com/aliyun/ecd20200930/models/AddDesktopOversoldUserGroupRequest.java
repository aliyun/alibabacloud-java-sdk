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

}
