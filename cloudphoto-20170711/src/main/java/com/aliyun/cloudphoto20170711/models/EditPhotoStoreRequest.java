// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class EditPhotoStoreRequest extends TeaModel {
    @NameInMap("AutoCleanEnabled")
    public String autoCleanEnabled;

    @NameInMap("AutoCleanDays")
    public Integer autoCleanDays;

    @NameInMap("DefaultQuota")
    public Long defaultQuota;

    @NameInMap("DefaultTrashQuota")
    public Long defaultTrashQuota;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("StoreName")
    public String storeName;

    public static EditPhotoStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        EditPhotoStoreRequest self = new EditPhotoStoreRequest();
        return TeaModel.build(map, self);
    }

    public EditPhotoStoreRequest setAutoCleanEnabled(String autoCleanEnabled) {
        this.autoCleanEnabled = autoCleanEnabled;
        return this;
    }
    public String getAutoCleanEnabled() {
        return this.autoCleanEnabled;
    }

    public EditPhotoStoreRequest setAutoCleanDays(Integer autoCleanDays) {
        this.autoCleanDays = autoCleanDays;
        return this;
    }
    public Integer getAutoCleanDays() {
        return this.autoCleanDays;
    }

    public EditPhotoStoreRequest setDefaultQuota(Long defaultQuota) {
        this.defaultQuota = defaultQuota;
        return this;
    }
    public Long getDefaultQuota() {
        return this.defaultQuota;
    }

    public EditPhotoStoreRequest setDefaultTrashQuota(Long defaultTrashQuota) {
        this.defaultTrashQuota = defaultTrashQuota;
        return this;
    }
    public Long getDefaultTrashQuota() {
        return this.defaultTrashQuota;
    }

    public EditPhotoStoreRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public EditPhotoStoreRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

}
