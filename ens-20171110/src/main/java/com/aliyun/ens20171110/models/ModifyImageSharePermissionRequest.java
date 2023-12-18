// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyImageSharePermissionRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account with which you want to share the image. You can specify multiple Alibaba Cloud IDs. Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("AddAccounts")
    public String addAccounts;

    /**
     * <p>The ID of the image. You can specify only one image ID. Custom images and public images are supported.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The ID of the Alibaba Cloud account from which you want to unshare the image. You can specify only one Alibaba Cloud account ID.</p>
     */
    @NameInMap("RemoveAccounts")
    public String removeAccounts;

    public static ModifyImageSharePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageSharePermissionRequest self = new ModifyImageSharePermissionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyImageSharePermissionRequest setAddAccounts(String addAccounts) {
        this.addAccounts = addAccounts;
        return this;
    }
    public String getAddAccounts() {
        return this.addAccounts;
    }

    public ModifyImageSharePermissionRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyImageSharePermissionRequest setRemoveAccounts(String removeAccounts) {
        this.removeAccounts = removeAccounts;
        return this;
    }
    public String getRemoveAccounts() {
        return this.removeAccounts;
    }

}
