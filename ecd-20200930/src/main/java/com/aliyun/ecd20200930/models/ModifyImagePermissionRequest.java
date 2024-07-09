// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyImagePermissionRequest extends TeaModel {
    /**
     * <p>The IDs of Alibaba Cloud accounts to which to share the image that will be created based on the image template. You can specify up to 20 account IDs.</p>
     */
    @NameInMap("AddAccount")
    public java.util.List<Long> addAccount;

    /**
     * <p>The IDs of the images.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>m-gx2x1dhsmusr2****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of Alibaba Cloud account N from which you want to unshare the custom image. Valid values of N: 1 to 10. If the value of N is greater than 10, this parameter is ignored.</p>
     */
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
