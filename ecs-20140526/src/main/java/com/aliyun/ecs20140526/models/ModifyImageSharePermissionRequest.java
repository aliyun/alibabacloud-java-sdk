// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyImageSharePermissionRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ImageId")
    @Validation(required = true)
    public String imageId;

    @NameInMap("AddAccount")
    public java.util.List<String> addAccount;

    @NameInMap("RemoveAccount")
    public java.util.List<String> removeAccount;

    @NameInMap("LaunchPermission")
    public String launchPermission;

    public static ModifyImageSharePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageSharePermissionRequest self = new ModifyImageSharePermissionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyImageSharePermissionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyImageSharePermissionRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyImageSharePermissionRequest setAddAccount(java.util.List<String> addAccount) {
        this.addAccount = addAccount;
        return this;
    }
    public java.util.List<String> getAddAccount() {
        return this.addAccount;
    }

    public ModifyImageSharePermissionRequest setRemoveAccount(java.util.List<String> removeAccount) {
        this.removeAccount = removeAccount;
        return this;
    }
    public java.util.List<String> getRemoveAccount() {
        return this.removeAccount;
    }

    public ModifyImageSharePermissionRequest setLaunchPermission(String launchPermission) {
        this.launchPermission = launchPermission;
        return this;
    }
    public String getLaunchPermission() {
        return this.launchPermission;
    }

}
