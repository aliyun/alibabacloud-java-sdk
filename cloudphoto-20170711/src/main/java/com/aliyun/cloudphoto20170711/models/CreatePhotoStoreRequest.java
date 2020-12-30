// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class CreatePhotoStoreRequest extends TeaModel {
    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("DefaultQuota")
    public Long defaultQuota;

    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("Remark")
    public String remark;

    public static CreatePhotoStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePhotoStoreRequest self = new CreatePhotoStoreRequest();
        return TeaModel.build(map, self);
    }

    public CreatePhotoStoreRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public CreatePhotoStoreRequest setDefaultQuota(Long defaultQuota) {
        this.defaultQuota = defaultQuota;
        return this;
    }
    public Long getDefaultQuota() {
        return this.defaultQuota;
    }

    public CreatePhotoStoreRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public CreatePhotoStoreRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
