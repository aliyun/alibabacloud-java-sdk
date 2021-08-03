// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyBundleRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("BundleId")
    public String bundleId;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("BundleName")
    public String bundleName;

    @NameInMap("Description")
    public String description;

    public static ModifyBundleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBundleRequest self = new ModifyBundleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBundleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyBundleRequest setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public String getBundleId() {
        return this.bundleId;
    }

    public ModifyBundleRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyBundleRequest setBundleName(String bundleName) {
        this.bundleName = bundleName;
        return this;
    }
    public String getBundleName() {
        return this.bundleName;
    }

    public ModifyBundleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
