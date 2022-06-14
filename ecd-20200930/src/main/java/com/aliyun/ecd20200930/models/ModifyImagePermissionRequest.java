// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyImagePermissionRequest extends TeaModel {
    @NameInMap("AddAccount")
    public java.util.List<Long> addAccount;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RemoveAccount")
    public java.util.List<Long> removeAccount;

    public static ModifyImagePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyImagePermissionRequest self = new ModifyImagePermissionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyImagePermissionRequest setAddAccount(java.util.List<Long> addAccount) {
        this.addAccount = addAccount;
        return this;
    }
    public java.util.List<Long> getAddAccount() {
        return this.addAccount;
    }

    public ModifyImagePermissionRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyImagePermissionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyImagePermissionRequest setRemoveAccount(java.util.List<Long> removeAccount) {
        this.removeAccount = removeAccount;
        return this;
    }
    public java.util.List<Long> getRemoveAccount() {
        return this.removeAccount;
    }

}
