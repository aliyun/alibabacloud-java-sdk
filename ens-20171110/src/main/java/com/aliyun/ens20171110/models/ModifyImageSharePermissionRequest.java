// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyImageSharePermissionRequest extends TeaModel {
    @NameInMap("ImageId")
    @Validation(required = true)
    public String imageId;

    @NameInMap("AddAccounts")
    public String addAccounts;

    @NameInMap("RemoveAccounts")
    public String removeAccounts;

    public static ModifyImageSharePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageSharePermissionRequest self = new ModifyImageSharePermissionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyImageSharePermissionRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyImageSharePermissionRequest setAddAccounts(String addAccounts) {
        this.addAccounts = addAccounts;
        return this;
    }
    public String getAddAccounts() {
        return this.addAccounts;
    }

    public ModifyImageSharePermissionRequest setRemoveAccounts(String removeAccounts) {
        this.removeAccounts = removeAccounts;
        return this;
    }
    public String getRemoveAccounts() {
        return this.removeAccounts;
    }

}
