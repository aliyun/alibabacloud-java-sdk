// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyBundleRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("BundleId")
    public String bundleId;

    /**
     * <p>The description of the new desktop template.</p>
     */
    @NameInMap("BundleName")
    public String bundleName;

    /**
     * <p>ModifyBundle</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The operation that you want to perform. Set the value to ModifyBundle.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("Language")
    public String language;

    /**
     * <p>The name of the new desktop template.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyBundleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBundleRequest self = new ModifyBundleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBundleRequest setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public String getBundleId() {
        return this.bundleId;
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

    public ModifyBundleRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyBundleRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ModifyBundleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
